package com.company.task1_HW18;

public interface Rentable {
    default void rent() {
        System.out.println("Сдать в аренду");
    }
    default void receiveRentalPayment() {
        System.out.println("Получить арендную плату");
    }
}
