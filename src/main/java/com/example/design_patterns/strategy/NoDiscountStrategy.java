package com.example.design_patterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}
