package com.parkinglot.models;

import com.parkinglot.enums.ParkingSpotStatus;
import com.parkinglot.enums.VehicleType;

public class ParkingSpot {
    private int spotId;
    private int levelId;
    private VehicleType vehicleType;
    private ParkingSpotStatus status;
    private double hourlyRate;

    public ParkingSpot(int spotId, int levelId, VehicleType vehicleType, double hourlyRate) {
        this.spotId = spotId;
        this.levelId = levelId;
        this.vehicleType = vehicleType;
        this.hourlyRate = hourlyRate;
        this.status = ParkingSpotStatus.AVAILABLE;
    }

    public int getSpotId() {
        return spotId;
    }

    public int getLevelId() {
        return levelId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isAvailable() {
        return this.status == ParkingSpotStatus.AVAILABLE;
    }
}
