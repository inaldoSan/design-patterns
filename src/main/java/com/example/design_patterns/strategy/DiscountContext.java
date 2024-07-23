package com.example.design_patterns.strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountContext {
    private final NoDiscountStrategy noDiscountStrategy;
    private final ChristmasDiscountStrategy christmasDiscountStrategy;
    private final NewYearDiscountStrategy newYearDiscountStrategy;

    @Autowired
    public DiscountContext(NoDiscountStrategy noDiscountStrategy, ChristmasDiscountStrategy christmasDiscountStrategy, NewYearDiscountStrategy newYearDiscountStrategy) {
        this.noDiscountStrategy = noDiscountStrategy;
        this.christmasDiscountStrategy = christmasDiscountStrategy;
        this.newYearDiscountStrategy = newYearDiscountStrategy;
    }

    public double applyDiscount(String discountType, double price) {
        switch (discountType.toLowerCase()) {
            case "christmas":
                return christmasDiscountStrategy.applyDiscount(price);
            case "newyear":
                return newYearDiscountStrategy.applyDiscount(price);
            default:
                return noDiscountStrategy.applyDiscount(price);
        }
    }
}