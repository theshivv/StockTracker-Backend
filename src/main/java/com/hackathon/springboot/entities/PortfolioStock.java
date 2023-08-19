package com.hackathon.springboot.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Timestamp;

import java.util.Date;


@Entity
public class PortfolioStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String stockTicker;
    private double price;
    private int quantity;

    private Date timeStamp;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStockTicker() {
        return stockTicker;
    }

    public void setStockTicker(String stockTicker) {
        this.stockTicker = stockTicker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




    public PortfolioStock() {
    }

    public PortfolioStock(String stockTicker, double price, int quantity, Date timeStamp) {
        this.stockTicker = stockTicker;
        this.price = price;
        this.quantity = quantity;
        this.timeStamp = timeStamp;
    }

    public PortfolioStock(int id, String stockTicker, double price, int quantity, Date timeStamp) {
        this.id = id;
        this.stockTicker = stockTicker;
        this.price = price;
        this.quantity = quantity;
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "PortfolioStock{" +
                "id=" + id +
                ", stockTicker='" + stockTicker + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +

                '}';
    }


}
