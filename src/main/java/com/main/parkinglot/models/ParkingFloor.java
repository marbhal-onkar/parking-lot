package com.main.parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseModel{

    private Integer floorNumber;
    private List<ParkingSpot> spots = new ArrayList<>();
    private DisplayBoard displayBoard;
    private PaymentCounter paymentCounter;
}
