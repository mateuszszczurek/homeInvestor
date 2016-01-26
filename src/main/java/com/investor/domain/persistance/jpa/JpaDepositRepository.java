package com.investor.domain.persistance.jpa;

import com.investor.domain.deposits.Deposit;
import com.investor.domain.persistance.DepositRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

@Repository
public class JpaDepositRepository implements DepositRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveDeposit(Deposit deposit) {
        entityManager.persist(deposit);
    }

    @Override
    public List<Deposit> fetchAllDeposits() {
        return entityManager.createNamedQuery("Deposit.getAllDeposits", Deposit.class).getResultList();
    }

    @Override
    public Deposit getDeposit(Integer id) {
        Query query = entityManager.createQuery("SELECT d FROM Deposit d WHERE d.id = :id");
        query.setParameter("id", id);
        return (Deposit) query.getSingleResult();
    }

    @Override
    public Collection<Deposit> getDepositsForUser(int userId) {
        return entityManager.createNamedQuery("Deposit.depositsForUser", Deposit.class).getResultList();
    }


}
