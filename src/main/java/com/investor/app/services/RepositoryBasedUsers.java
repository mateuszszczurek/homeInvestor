package com.investor.app.services;

import com.investor.app.domain.deposits.Deposit;
import com.investor.app.domain.persistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RepositoryBasedUsers implements Users {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Deposit> getDepositsForUser(int userId) {
        return userRepository.getUserById(userId).getDeposits();
    }
}
