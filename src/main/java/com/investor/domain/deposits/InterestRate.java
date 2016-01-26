package com.investor.domain.deposits;

import java.math.BigDecimal;

class InterestRate {

    private final BigDecimal value;

    private InterestRate(BigDecimal value) {
        this.value = value;
    }
}
