package com.hackathon.springboot.services;

import com.hackathon.springboot.entities.Stock;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface StockService {

    public List<Stock> getAllStocks();

    public Stock getStockbyId(int id);

    public List<Stock> getStockByStockTicker(String stock_ticker);

    public Stock addStock(Stock stock);

    public Stock updateStock(Stock stock);

    public void deleteStock(int id);

}
