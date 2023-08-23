package com.hackathon.springboot.entities;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void setStockTicker() {
        Stock testStock=new Stock(1,"AMZN",10.0,2,"BUY",0);
        assertThat(testStock.getStockTicker()).isEqualTo("AMZN");
    }
}