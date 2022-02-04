package com.company.task1_HW18;

public class Office extends Premises {
    public String companyName;
    public String companyOwner;
    public int amountOfWorkers;

    public Office(int roomNum, int floorNum, int entranceNum, double costOfRentingInMonth,
                  String companyName, String companyOwner, int amountOfWorkers) {
        super(roomNum, floorNum, entranceNum, costOfRentingInMonth);
        this.companyName = companyName;
        this.companyOwner = companyOwner;
        this.amountOfWorkers = amountOfWorkers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    public void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }

    public String toString() {
        return "Office{" +
                "companyName='" + companyName + '\'' +
                ", companyOwner='" + companyOwner + '\'' +
                ", amountOfWorkers=" + amountOfWorkers +
                '}';
    }

    public void rent() {
        super.rent();
    }

    public void receiveRentalPayment() {
        super.receiveRentalPayment();
    }

    public int workersOfHome () {
        return roomNum*amountOfWorkers;
    }
}
