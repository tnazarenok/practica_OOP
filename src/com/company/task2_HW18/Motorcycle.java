package com.company.task2_HW18;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private String uniqueField;

    public Motorcycle(String uniqueField, String unique) {
        super();
        this.uniqueField = uniqueField;
    }

    public String getUniqueField() {
        return uniqueField;
    }

    public void setUniqueField(String uniqueField) {
        this.uniqueField = uniqueField;

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "uniqueField='" + uniqueField + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(uniqueField, that.uniqueField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueField);
    }
}
