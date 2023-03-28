package com.dtarasiuk.paterns.structural.facade;

public class CompFacade {
    private CPU cpu;
    private HardDrive hd;
    private Memory memory;

    public CompFacade(){
        this.cpu = new CPU();
        this.hd =  new HardDrive();
        this.memory = new Memory();
    }

    public void start(){
        cpu.processData();
        memory.load();
        hd.readData();
    }


}
