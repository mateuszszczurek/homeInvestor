package com.investor.app;

import com.investor.app.domain.persistance.DepositRepository;
import com.investor.app.domain.persistance.UserRepository;
import com.investor.app.domain.persistance.jpa.JpaDepositRepository;
import com.investor.app.domain.persistance.jpa.JpaUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean
    DepositRepository depositRepository() throws Exception {
        return new JpaDepositRepository();
    }

    @Bean
    UserRepository userRepository() throws Exception {
        return new JpaUserRepository();
    }



}