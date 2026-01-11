package com.parkinglot.services;

import com.parkinglot.models.ParkingSpot;
import java.util.List;

public interface Search {
    List<ParkingSpot> searchAvailableSpots();
    ParkingSpot searchParkingSpotById(int spotId);
}
