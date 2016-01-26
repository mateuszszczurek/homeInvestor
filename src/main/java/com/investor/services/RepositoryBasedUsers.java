package com.investor.services;

import com.investor.domain.persistance.UserRepository;
import com.investor.presentation.DepositModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class RepositoryBasedUsers implements Users {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<DepositModel> getDepositsForUser(int userId) {
        return null;
    }

//    @Override
//    public Collection<DepositModel> getDepositsForUser(int userId) {
//        Collection<Deposit> deposits = userRepository.getUserById(userId).getDeposits();
//
//
//    }
}
