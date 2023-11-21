package com.spring.project.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.project.service.ProductService;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class product {
    
    @Autowired
    private ProductService productService = ProductService.getProductService();

    @GetMapping("productmain")
    public String productmain(){
        log.info("productmain");
        return "productmain";
    }

}
