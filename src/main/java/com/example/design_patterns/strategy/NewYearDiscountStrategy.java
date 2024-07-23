package com.example.design_patterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class NewYearDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% de desconto
    }
}
