package com.company.HW_task1;

public class Person implements Eating, Breathing {
    public Person(String person) {
        Eating.eat();
        Breathing.breathe();
        Breathing.holdBreath();
    }

    @Override
    public void sneeze() {
        Breathing.super.sneeze();
    }

}
