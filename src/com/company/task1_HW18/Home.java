package com.company.task1_HW18;

//1.	Создать класс Дом, который содержит :
//•	список помещений, а именно квартир и офисов
//•	информацию о владельце
//•	годе постройки и количестве этажей
//=Помещения реализуют интерфейс Rentable с методами rent (сдать в аренду) и receiveRentalPayment (получить арендную плату).
//Класс Помещение содержит общие для Квартиры и Офиса методы и поля.
//Класс Квартира содержит:
//•	список комнат в квартире ("bathroom", "living room")
//•	количество жильцов
//•	номер помещения
//•	номер этажа
//•	номер подъезда
//•	стоимость аренды квартиры в месяц.
//Класс Офис содержит:
//•	название фирмы
//•	владелец фирмы
//•	номер помещения
//•	номер этажа
//•	номер подъезда
//•	количество работников
//•	стоимость аренды офиса в месяц
//Написать методы в классе Дом
//•	для подсчета отдельно квартир и офисов в доме.
//•	метод, подсчитывающий, сколько воды в день тратит данный дом в среднем, если считать, что жилец тратит 200 л воды, а работник 10 л воды в день.
//•	метод подсчитывающий доход со всех помещений в месяц.


public class Home extends Premises {
    public String listOfPremises;
    public String infoOwner;
    public float yearOfConstruction;
    public int numberOfFloors;

    static int count = 0;

    public Home(int roomNum, int floorNum, int entranceNum, double costOfRentingInMonth,
                String listOfPremises, String infoOwner,
                float yearOfConstruction, int numberOfFloors) {
        super(roomNum, floorNum, entranceNum, costOfRentingInMonth);
        this.listOfPremises = listOfPremises;
        this.infoOwner = infoOwner;
        this.yearOfConstruction = yearOfConstruction;
        this.numberOfFloors = numberOfFloors;
    }

    public String getListOfPremises() {
        return listOfPremises;
    }

    public void setListOfPremises(String listOfPremises) {
        this.listOfPremises = listOfPremises;
    }

    public String getInfoOwner() {
        return infoOwner;
    }

    public void setInfoOwner(String infoOwner) {
        this.infoOwner = infoOwner;
    }

    public float getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(float yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String toString() {
        return "Home{" +
                "listOfPremises='" + listOfPremises + '\'' +
                ", infoOwner='" + infoOwner + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public int countOffice() {
        if (listOfPremises == "Office") {
            count++;
        }
        System.out.println("Office" + count);
        return count;
    }

    public int countApartment() {
        if (listOfPremises == "Apartment") {
            count++;
        }
        System.out.println("Apartment" + count);
        return count;
    }

    Apartment apartment;
    Office office;

    public int amountOfWater() {
        return apartment.tenantsOfHome() * 100 + office.workersOfHome() * 10;
    }

    public double incomeOfMonth() {
        return (countOffice() + countApartment()) * costOfRentingInMonth;
    }
}
