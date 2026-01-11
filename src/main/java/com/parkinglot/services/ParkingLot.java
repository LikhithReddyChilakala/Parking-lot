package com.parkinglot.services;

import com.parkinglot.enums.ParkingLotStatus;
import com.parkinglot.models.Level;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements Search {
    private int lotId;
    private String name;
    private String address;
    private List<Level> levels;
    private ParkingLotStatus status;

    public ParkingLot(int lotId, String name, String address) {
        this.lotId = lotId;
        this.name = name;
        this.address = address;
        this.levels = new ArrayList<>();
        this.status = ParkingLotStatus.OPEN;
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public List<Level> getLevels() {
        return levels;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    @Override
    public java.util.List<com.parkinglot.models.ParkingSpot> searchAvailableSpots() {
        java.util.List<com.parkinglot.models.ParkingSpot> availableSpots = new ArrayList<>();
        for (Level level : levels) {
            for (com.parkinglot.models.ParkingSpot spot : level.getParkingSpots()) {
                if (spot.isAvailable()) {
                    availableSpots.add(spot);
                }
            }
        }
        return availableSpots;
    }

    @Override
    public com.parkinglot.models.ParkingSpot searchParkingSpotById(int spotId) {
        for (Level level : levels) {
            for (com.parkinglot.models.ParkingSpot spot : level.getParkingSpots()) {
                if (spot.getSpotId() == spotId) {
                    return spot;
                }
            }
        }
        return null;
    }
}
