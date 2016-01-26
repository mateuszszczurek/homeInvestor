package com.investor.services;

import com.investor.presentation.DepositModel;

import java.util.Collection;

public interface Users {

    Collection<DepositModel> getDepositsForUser(int userId);


}
