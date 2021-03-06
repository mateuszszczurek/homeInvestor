package com.investor.app.domain.persistance;

import com.investor.app.domain.users.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
@Repository
public interface UserRepository {

    public User getUserById(Integer id);

    public void saveUser(User user);

}
