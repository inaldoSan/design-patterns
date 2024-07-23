package com.example.design_patterns.facade;

import org.springframework.stereotype.Component;

@Component
public class CPU {
    public void start() {
        System.out.println("CPU started.");
    }

    public void execute() {
        System.out.println("CPU executing.");
    }

    public void load() {
        System.out.println("CPU loading.");
    }

    public void free() {
        System.out.println("CPU freeing.");
    }
}
