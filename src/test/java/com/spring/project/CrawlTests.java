package com.spring.project;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlTests {
	
public static void main(String[] args) throws Exception{
		
		String url = "https://www.cos.com/ko-kr/men/knitwear.html";
//		String url = "https://www.cos.com/ko-kr/women/knitwear.html";
		String name;
		String price;
		String img;
		List<String> idxList = new ArrayList<String>();
		String idx;

		Connection conn = Jsoup.connect(url);
		Document doc = conn.get();
		Elements els = doc.select("div.column");
//		System.out.println(els);

		for(Element el : els){
			idx = el.select("div.o-product").attr("data-index");
			idxList.add(idx);
			name = el.select("label.product-title").text();
			price = el.select("label.price").text();
			img = el.selectFirst(".m-product-image img").attr("src");
			System.out.println("DATA-INDEX ::: " + idx);
			System.out.println("상품명 ::: " + name);
			System.out.println("상품 가격 ::: " + price + "원");
			System.out.println("image ::: " + img);
			System.out.println("==================================================================");
			
//			Map<String, Object> crawl = new HashMap<String, Object>();
//			crawl.put("idx", idx);
//			crawl.put("name", name);
//			crawl.put("price", price);
//			crawl.put("img", img);

		}
		for(String dataIndex : idxList){
			File listDir = new File("c:/upload", dataIndex);
			
			if(!listDir.exists()){
				listDir.mkdir();
			}
			System.out.println(dataIndex);
			URL realUrl = new URL(url);
			System.out.println(realUrl);
			try {
				int bufferSize = 1024 * 1024; 
				byte[] buffer = new byte[bufferSize];
				int bytesRead;
				
				HttpURLConnection httpURLConnection = (HttpURLConnection) realUrl.openConnection();
				System.out.println(httpURLConnection);
				if(httpURLConnection.getResponseCode() == 503){
					 System.out.println("HTTP 503 오류: " + dataIndex + "번 이미지를 다운로드할 수 없습니다.");
                     continue; // 다음 이미지 다운로드를 시도
				}
				
				BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("c:/upload")));
				
				while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
                
                bos.close(); // 파일 닫기
                bis.close(); // 스트림 닫기   
                
                System.out.println("파일 다운로드");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}

	}

}
