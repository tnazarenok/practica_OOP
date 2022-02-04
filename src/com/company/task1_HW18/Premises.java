package com.company.task1_HW18;

public class Premises implements Rentable {
    protected int roomNum;
    protected int floorNum;
    protected int entranceNum;
    public double costOfRentingInMonth;

    Rentable rentable = new Rentable() {
        public void rent() {
            Rentable.super.rent();
        }

        public void receiveRentalPayment() {
            Rentable.super.receiveRentalPayment();
        }
    };

    public Premises(int roomNum, int floorNum, int entranceNum, double costOfRentingInMonth) {
        this.roomNum = roomNum;
        this.floorNum = floorNum;
        this.entranceNum = entranceNum;
        this.costOfRentingInMonth = costOfRentingInMonth;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getEntranceNum() {
        return entranceNum;
    }

    public void setEntranceNum(int entranceNum) {
        this.entranceNum = entranceNum;
    }

    public double getCostOfRentingInMonth() {
        return costOfRentingInMonth;
    }

    public void setCostOfRentingInMonth(double costOfRentingInMonth) {
        this.costOfRentingInMonth = costOfRentingInMonth;
    }

    public String toString() {
        return "Premises{" +
                "roomNum=" + roomNum +
                ", floorNum=" + floorNum +
                ", entranceNum=" + entranceNum +
                ", costOfRentingInMonth=" + costOfRentingInMonth +
                '}';
    }

}
