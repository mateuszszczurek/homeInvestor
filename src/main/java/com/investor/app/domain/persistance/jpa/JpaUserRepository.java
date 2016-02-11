package com.investor.app.domain.persistance.jpa;

import com.investor.app.domain.persistance.UserRepository;
import com.investor.app.domain.users.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaUserRepository implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById(Integer id) {
        return entityManager.createNamedQuery("User.getUserById", User.class).setParameter(1, id).getSingleResult();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }


}
