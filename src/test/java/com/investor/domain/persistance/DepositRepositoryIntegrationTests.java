package com.investor.domain.persistance;

import com.investor.Application;
import com.investor.domain.deposits.Deposit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
public class DepositRepositoryIntegrationTests {

    @Autowired
    DepositRepository depositRepository;

    @Test
    public void can_save_deposits() {
        Deposit deposit = new Deposit(LocalDate.of(2015, 1, 10), LocalDate.of(2015, 2, 15), 0.05f, 10000);

        depositRepository.saveDeposit(deposit);
        depositRepository.saveDeposit(new Deposit(LocalDate.of(2015, 1, 10), LocalDate.of(2015, 2, 15), 0.05f, 10000));
        depositRepository.saveDeposit(new Deposit(LocalDate.of(2015, 1, 10), LocalDate.of(2015, 2, 15), 0.05f, 10000));
        depositRepository.saveDeposit(new Deposit(LocalDate.of(2015, 1, 10), LocalDate.of(2015, 2, 15), 0.05f, 10000));

        Deposit retreivedDeposit = depositRepository.fetchAllDeposits().get(0);
        assertThat(retreivedDeposit.getAmount(), equalTo(deposit.getAmount()));
    }


}
