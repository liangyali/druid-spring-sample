package com.yintai.controller;

import com.yintai.domain.Product;
import com.yintai.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/index")
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<Product> json() {

        return productService.list();
    }
}