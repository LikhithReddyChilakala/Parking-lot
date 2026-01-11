package com.parkinglot.models;

import java.util.Date;
import com.parkinglot.enums.PaymentStatus;

public class Payment {
    private int paymentId;
    private double amount;
    private PaymentStatus status;
    private Date paymentDate;
    private String paymentMethod;

    public Payment(int paymentId, double amount, PaymentStatus status, String paymentMethod) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.paymentDate = new Date();
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
