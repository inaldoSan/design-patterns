package com.example.design_patterns.facade;

import org.springframework.stereotype.Component;

@Component
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory loading data at position " + position + ".");
    }
}
