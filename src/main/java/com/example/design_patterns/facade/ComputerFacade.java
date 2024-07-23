package com.example.design_patterns.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    @Autowired
    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void start() {
        cpu.start();
        cpu.load();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.execute();
    }
}