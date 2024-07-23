package com.example.design_patterns.facade;

import org.springframework.stereotype.Component;

@Component
public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive reading data.");
        return new byte[size];
    }
}