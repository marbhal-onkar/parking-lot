package com.main.parkinglot.models;

import java.sql.Date;

public class Ticket extends BaseModel{

    private Long vehicleId;
    private Date entryTime;
    private Long parkingSpotId;
    private Long entryGateId;
    private User user;
}
