package com.investor.domain.users;

import com.investor.domain.deposits.Deposit;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.emptyList;

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "User.getUserById", query = "SELECT e FROM User e WHERE e.id = ?1 ")
        }
)
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String lastName;

    protected User() {
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "deposit_id")
    private Collection<Deposit> deposits = new ArrayList<>();

    public User(String name, String lastName, Collection<Deposit> deposits) {
        this.name = name;
        this.lastName = lastName;
        this.deposits = deposits;
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public Collection<Deposit> getDeposits() {
        return deposits;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void addDeposit(Deposit deposit) {
        this.deposits.add(deposit);
    }
}
