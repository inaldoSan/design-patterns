package com.example.design_patterns.controller;
import com.example.design_patterns.facade.ComputerFacade;
import com.example.design_patterns.strategy.DiscountContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/padroes")
public class PadroesController {

    @Autowired
    private DiscountContext discountContext;

    @Autowired
    private ComputerFacade computerFacade;

    @GetMapping("/strategy")
    public double testStrategy(@RequestParam String type, @RequestParam double price) {
        return discountContext.applyDiscount(type, price);
    }

    @GetMapping("/facade")
    public String testFacade() {
        computerFacade.start();
        return "Computer started using Facade.";
    }
}