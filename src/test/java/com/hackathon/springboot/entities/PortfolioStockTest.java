package com.hackathon.springboot.entities;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PortfolioStockTest {
    PortfolioStock portfoliostock = new PortfolioStock(1, "AMZN", 190.0, 2, null);
    @Test
    public void getQuantity_success(){
        assertEquals(portfoliostock.getQuantity(), 2);
    }
    @Test
    public void getId_success(){
        assertEquals(portfoliostock.getId(), 1);
    }
    @Test
    public void getStockTicker_success(){
        assertEquals(portfoliostock.getStockTicker(), "AMZN");
    }
    @Test
    public void getprice_success(){
        assertEquals(portfoliostock.getPrice(), 190.0);
    }
    @Test
    public void getTimeStamp_success(){
        assertNull(portfoliostock.getTimeStamp());
    }
    @Test
    public void toString_success(){
        assertEquals(portfoliostock.toString(), "PortfolioStock{" +
                "id=1" +
                ", stockTicker='AMZN"  + '\'' +
                ", price=190.0" +
                ", quantity=2"  +
                '}');
    }

    @Test
    public void testSetId() {
        int id = 1000;
        PortfolioStock instance = new PortfolioStock();
        instance.setId(id);
        assertEquals(instance.getId(), id);
    }

    @Test
    public void testSetPrice() {
        double price = 1000;
        PortfolioStock instance = new PortfolioStock();
        instance.setPrice(price);
        assertEquals(instance.getPrice(), price);
    }
    @Test
    public void testSetQuantity() {
        int quantity = 1000;
        PortfolioStock instance = new PortfolioStock();
        instance.setQuantity(quantity);
        assertEquals(instance.getQuantity(), quantity);
    }
    @Test
    public void testSetStockTicker() {
        String stockTicker  = "AMZN";
        PortfolioStock instance = new PortfolioStock();
        instance.setStockTicker(stockTicker);
        assertEquals(instance.getStockTicker(), stockTicker);
    }
    @Test
    public void testSetTimeStamp() {
        Date timeStamp = null;
        PortfolioStock instance = new PortfolioStock();
        instance.setTimeStamp(timeStamp);
        assertNull(instance.getTimeStamp());
    }

}
