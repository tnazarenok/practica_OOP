package com.company.task1_HW18;

public class Apartment extends Premises {
    public String roomName;
    public int numOfTenants;

    public Apartment(int roomNum, int floorNum, int entranceNum, double costOfRentingInMonth,
                     String roomName, int numOfTenants) {
        super(roomNum, floorNum, entranceNum, costOfRentingInMonth);
        this.roomName = roomName;
        this.numOfTenants = numOfTenants;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumOfTenants() {
        return numOfTenants;
    }

    public void setNumOfTenants(int numOfTenants) {
        this.numOfTenants = numOfTenants;
    }

    public String toString() {
        return "Apartment{" +
                "roomName='" + roomName + '\'' +
                ", numOfTenants=" + numOfTenants +
                '}';
    }

    public void rent() {
        super.rent();
    }

    public void receiveRentalPayment() {
        super.receiveRentalPayment();
    }

    public int tenantsOfHome () {
        return roomNum*numOfTenants;
        }
}
