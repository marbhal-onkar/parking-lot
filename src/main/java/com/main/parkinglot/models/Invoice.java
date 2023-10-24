package com.main.parkinglot.models;

import java.sql.Date;

public class Invoice extends BaseModel {

    private Date exitTime;
    private Ticket ticket;
    private Double amount;
    private Long exitGateId;
}
