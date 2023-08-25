package com.hackathon.springboot.entities;

import org.junit.jupiter.api.Test;

import javax.sound.sampled.Port;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class PortfolioStockTest {

    PortfolioStock testPortfolioStock = new PortfolioStock(
            1,"AMZN",190.0,2,null
    );

    @Test
    void getQuantity() {
        assertThat(testPortfolioStock.getQuantity()).isEqualTo(2);
    }

    @Test
    void setQuantity() {
    }
}