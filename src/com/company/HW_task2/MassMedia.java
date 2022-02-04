package com.company.HW_task2;

// 2.Создать иерархию средств массовой информации: газет, журналов, телеканалов, блогов, новостных сайтов...
//   В задании использовать помимо обычных классов, абстрактные классы, интерфейсы.
//   Создать поля и методы специфические для каждого класса.

public abstract class MassMedia {
    protected String name;
    public int page;
    public final String specialization;

    public MassMedia(String name, int page, String specialization) {
        this.name = name;
        this.page = page;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "MassMedia{" +
                "name='" + name + '\'' +
                ", page=" + page +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
