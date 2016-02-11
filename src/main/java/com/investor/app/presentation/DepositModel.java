package com.investor.app.presentation;

import java.time.LocalDate;

public class DepositModel {

    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private float interestRate;
    private int amount;

    public DepositModel(LocalDate startDate, LocalDate endDate, float interestRate, int amount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public int getAmount() {
        return amount;
    }


}
