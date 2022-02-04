package com.company.HW_task2;

public class TVChannel extends MassMedia implements Readable {
    public TVChannel(String name, int page, String specialization) {
        super(name, page, specialization);
    }

    @Override
    public void watch() {
        Readable.super.watch();
    }
}
