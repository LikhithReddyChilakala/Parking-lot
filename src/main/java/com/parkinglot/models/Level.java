package com.parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int levelId;
    private int floor;
    private List<ParkingSpot> parkingSpots;
    private int availableSpots;

    public Level(int levelId, int floor, int totalSpots) {
        this.levelId = levelId;
        this.floor = floor;
        this.parkingSpots = new ArrayList<>();
        this.availableSpots = totalSpots;
    }

    public int getLevelId() {
        return levelId;
    }

    public int getFloor() {
        return floor;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    public ParkingSpot findAvailableSpot() {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable()) {
                return spot;
            }
        }
        return null;
    }
}
