package org.example.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("stock remove");
        return "stock removed";
    }
}
