package com.company.HW_task2;

public class NewsSite extends MassMedia implements Readable{
    public NewsSite(String name, int page, String specialization) {
        super(name, page, specialization);
    }

    @Override
    public void read() {
        Readable.super.read();
    }

    @Override
    public void watch() {
        Readable.super.watch();
    }
}
