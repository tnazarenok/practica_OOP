package com.company.HW_task2;

public class Magazine extends MassMedia implements Readable {
    public Magazine(String name, int page, String specialization) {
        super(name, page, specialization);
    }

    @Override
    public void read() {
        Readable.super.read();
    }
}
