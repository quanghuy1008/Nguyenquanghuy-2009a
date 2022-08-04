package com.example.nguyenquanghuy2009a.controllers;

import com.example.nguyenquanghuy2009a.entity.Stock;
import com.example.nguyenquanghuy2009a.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class WebController {
    @Autowired
    StockService stockService;

    @GetMapping("/")
    public String index(Model model){
        List<Stock> stocks = stockService.getAllStock();
        model.addAttribute("stocks", stocks);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Stock stocks = new Stock();
        model.addAttribute("product", stocks);
        return "createuser";
    }


}
