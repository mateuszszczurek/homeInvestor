package com.investor.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.springframework.boot.SpringApplication.run;


@SpringBootApplication
public class Application {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        run(Application.class, args);
    }



}