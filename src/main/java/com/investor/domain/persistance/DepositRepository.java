package com.investor.domain.persistance;

import com.investor.domain.deposits.Deposit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
@Repository
public interface DepositRepository {

    public void saveDeposit(Deposit deposit);

    public List<Deposit> fetchAllDeposits();

    public Deposit getDeposit(Integer id);

    public Collection<Deposit> getDepositsForUser(int userId);

}
