package com.hackathon.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String stockTicker;
    private double price;
    private int volume;
    private String buyOrSell;
    private int statusCode;

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", stockTicker='" + stockTicker + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", buyOrSell='" + buyOrSell + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }

    public Stock(String stockTicker, double price, int volume, String buyOrSell, int statusCode) {
        this.stockTicker = stockTicker;
        this.price = price;
        this.volume = volume;
        this.buyOrSell = buyOrSell;
        this.statusCode = statusCode;
    }

    public Stock() {
    }

    public Stock(int id, String stockTicker, double price, int volume, String buyOrSell, int statusCode) {
        this.id = id;
        this.stockTicker = stockTicker;
        this.price = price;
        this.volume = volume;
        this.buyOrSell = buyOrSell;
        this.statusCode = statusCode;
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBuyOrSell() {
        return buyOrSell;
    }

    public void setBuyOrSell(String buyOrSell) {
        this.buyOrSell = buyOrSell;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
