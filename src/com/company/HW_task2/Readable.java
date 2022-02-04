package com.company.HW_task2;

public interface Readable {
    default void read() {
        System.out.println("is reading");
    }
    default void watch() {
        System.out.println("is watching");
    }

}
