package com.main.parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel {

    private String name;
    private String address;
    private List<ParkingFloor> floors = new ArrayList<>();
    private List<Gate> entryGates = new ArrayList<>();
    private List<Gate> exitGates = new ArrayList<>();
    private DisplayBoard displayBoard;
}
