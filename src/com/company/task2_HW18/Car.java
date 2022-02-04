package com.company.task2_HW18;

public class Car extends Vehicle{
    private String uniqueCarField;

    public Car(String uniqueCarField) {
        this.uniqueCarField = uniqueCarField;
    }

    public String getUniqueCarField() {
        return uniqueCarField;
    }

    public void setUniqueCarField(String uniqueCarField) {
        this.uniqueCarField = uniqueCarField;
    }

    @Override
    public String toString() {
        return "Car{" +
                "uniqueCarField='" + uniqueCarField + '\'' +
                '}';
    }
}
