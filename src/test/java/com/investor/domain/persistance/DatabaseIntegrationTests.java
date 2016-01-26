package com.investor.domain.persistance;

import com.investor.Application;
import com.investor.domain.deposits.Deposit;
import com.investor.domain.users.User;
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
public class DatabaseIntegrationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void can_save_user() {

        User user = userForTests();

        userRepository.saveUser(user);

        int generatedId = user.getId();

        User fetchedUser = userRepository.getUserById(generatedId);

        assertThat(fetchedUser.getName(), equalTo("Mateusz"));
        assertThat(fetchedUser.getLastName(), equalTo("Szczurek"));
        assertThat(fetchedUser.getId(), equalTo(generatedId));
    }

    @Test
    public void can_save_user_with_deposit() {
        Deposit deposit = new Deposit(LocalDate.of(2015, 1, 10), LocalDate.of(2015, 2, 15), 0.05f, 10000);

        User user = userForTests();
        user.addDeposit(deposit);

        userRepository.saveUser(user);

        int generatedId = user.getId();

        User fetchedUser = userRepository.getUserById(generatedId);

        assertThat(fetchedUser.getDeposits().size(), equalTo(1));
        assertThat(fetchedUser.getDeposits().stream().findFirst().get().getAmount(), equalTo(10000));
    }

    private User userForTests() {
        return new User("Mateusz", "Szczurek");
    }

}
