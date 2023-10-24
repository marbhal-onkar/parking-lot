package com.main.parkinglot.models;

public class Payment extends BaseModel {

    private PaymentMode paymentMode;
    private Double amount;
    private String transactionId;
    private PaymentStatus status;
}
