package com.investor.app.services;

import com.investor.app.domain.deposits.Deposit;

import java.util.List;

public interface Users {

    List<Deposit> getDepositsForUser(int userId);

}
