package com.company.HW_task1;

public class Animal implements Eating, Breathing {
    public Animal(String animal) {
        Eating.eat();
        Breathing.breathe();
        Breathing.holdBreath();
    }

    @Override
    public void sneeze() {
        Breathing.super.sneeze();
    }

}

