package com.hackathon.springboot.entities;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    Stock testStock=new Stock(1,"AMZN",10.0,2,"BUY",0);
    @Test
    public void testGetStockTicker() {
        assertEquals(testStock.getStockTicker(), "AMZN");
    }
    @Test
    public void testGetId() {
        assertEquals(testStock.getId(), 1);
    }
    @Test
    public void testGetPrice() {
        assertEquals(testStock.getPrice(), 10.0);
    }
    @Test
    public void testGetVolume() {
        assertEquals(testStock.getVolume(), 2);
    }
    @Test
    public void testGetBuyOrSell() {
        assertEquals(testStock.getBuyOrSell(), "BUY");
    }
    @Test
    public void testGetStatusCode() {
        assertEquals(testStock.getStatusCode(), 0);
    }

    @Test
    public void toString_success(){
        Stock testStock=new Stock(1,"AMZN",10.0,2,"BUY",0);
        assertEquals(testStock.toString(), "Stock{" + "id=1"  + ", stockTicker='AMZN"  + '\'' + ", price=10.0"  + ", volume=2" + ", buyOrSell='BUY"  + '\'' + ", statusCode=0"  + '}');
    }

    @Test
    public void testSetId() {
        int id = 1000;
        Stock instance = new Stock();
        instance.setId(id);
        assertEquals(instance.getId(), id);
    }
    @Test
    public void testSetStockTicker() {
        String stockTicker  = "AMZN";
        Stock instance = new Stock();
        instance.setStockTicker(stockTicker);
        assertEquals(instance.getStockTicker(), stockTicker);
    }
    @Test
    public void testSetPrice() {
        double price = 1000;
        Stock instance = new Stock();
        instance.setPrice(price);
        assertEquals(instance.getPrice(), price);
    }
    @Test
    public void testSetVolume() {
        int volume = 1000;
        Stock instance = new Stock();
        instance.setVolume(volume);
        assertEquals(instance.getVolume(), volume);
    }

    @Test
    public void testSetBuyOrSell() {
        String buyOrSell = "BUY";
        Stock instance = new Stock();
        instance.setBuyOrSell(buyOrSell);
        assertEquals(instance.getBuyOrSell(), buyOrSell);
    }
    @Test
    public void testSetStatusCode() {
        int code = 1;
        Stock instance = new Stock();
        instance.setStatusCode(code);
        assertEquals(instance.getStatusCode(), code);
    }

}