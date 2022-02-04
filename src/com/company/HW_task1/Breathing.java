package com.company.HW_task1;

public interface Breathing {
    static void breathe() {
        System.out.println("breathe Breathing");
    }

    static void holdBreath() {
        System.out.println("holdBreath Breathing");
    }

    default void sneeze() {
        System.out.println("sneeze Breathing");
    }
}
