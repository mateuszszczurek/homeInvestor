package com.investor.web.controllers;

import com.investor.domain.deposits.Deposit;
import com.investor.domain.persistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("deposits")
public class DepositsController {

    private final UserRepository users;

    @Autowired
    public DepositsController(UserRepository users) {
        this.users  = users;
    }

    @RequestMapping(value = "{userId}", method = RequestMethod.GET, produces = "application/json")
    public Collection<Deposit> depositsForUser(@PathVariable int userId) {
        return users.getUserById(userId).getDeposits();
    }

}
