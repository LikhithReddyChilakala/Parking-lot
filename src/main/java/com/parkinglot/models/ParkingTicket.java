package com.parkinglot.models;

import java.util.Date;

public class ParkingTicket {
    private int ticketId;
    private int parkingSpotId;
    private Vehicle vehicle;
    private Date entryTime;
    private Date exitTime;
    private double amount;

    public ParkingTicket(int ticketId, int parkingSpotId, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.parkingSpotId = parkingSpotId;
        this.vehicle = vehicle;
        this.entryTime = new Date();
    }

    public int getTicketId() {
        return ticketId;
    }
Add ParkingTicket class    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
