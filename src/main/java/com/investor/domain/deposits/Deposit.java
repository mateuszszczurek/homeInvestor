package com.investor.domain.deposits;

import com.investor.domain.users.User;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NamedQueries(
        {
                @NamedQuery(name="Deposit.getAllDeposits", query = "SELECT e FROM Deposit e ")
        }
)
public class Deposit {

    @Id
    @GeneratedValue
    private int id;

    private LocalDate startDate;
    private LocalDate endDate;
    private float interestRate;
    private int amount;

    public Deposit(LocalDate startDate, LocalDate endDate, float interestRate, int amount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    protected Deposit() {
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
