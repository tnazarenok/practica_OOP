package com.company.HW_task2;

public class Newspaper extends MassMedia implements Readable {
    public Newspaper(String name, int page, String specialization) {
        super(name, page, specialization);
    }

    @Override
    public void read() {
        Readable.super.read();
    }
}
