package com.hplus.controllers;

import com.hplus.model.Product;
import com.hplus.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/search")
    public String goSearch(@RequestParam("search") String search, Model model){
        System.out.println("Inside the SearchController");
        System.out.println("Searching item : " + search);

        List<Product> products = new ArrayList<>();
        products = productRepository.searchByName(search);
        model.addAttribute("products",products);
        return "search";
    }
}
