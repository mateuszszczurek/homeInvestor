package com.investor.domain.deposits;

import java.math.BigDecimal;

class Money {

    private final BigDecimal value;

    private Money(BigDecimal value) {
        this.value = value;
    }
}
