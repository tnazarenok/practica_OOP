package com.company.HW_task1;

public class Main {
//1. Создать интерфейсы Eating с методом eat и Breathing с методами breathe и holdBreath,
//default методом sneeze. Создать классы Person и Animal, которые реализуют оба интерфейса.
//Каждый метод выводит свое название и класс, в котором находится.
//Создать в классе Main метод, который принимает интерфейс Breathing и выполняет все методы интерфейса.
//Вызвать его для объектов класса Person и Animal.

    public static void accepts() {
        Breathing breathing = new Breathing() {
            @Override
            public void sneeze() {
                Breathing.super.sneeze();
            }
        };
        Breathing.breathe();
        Breathing.holdBreath();
        Eating.eat();
    }

    public static void main(String[] args) {

        Breathing breathing = new Animal("animal");
        System.out.println("Animal");
        accepts();

        Breathing breathing1 = new Person("person");
        System.out.println("Person");
        accepts();
    }
}
