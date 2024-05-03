package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class LandingController {
    @Autowired
    IProductService productService;

    @GetMapping("/home")
    public String toHomePage(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products",
                products);
        return "/landingPage";
    }

}
