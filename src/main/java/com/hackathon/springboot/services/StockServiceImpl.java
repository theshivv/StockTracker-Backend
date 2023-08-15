package com.hackathon.springboot.services;

import com.hackathon.springboot.entities.Stock;
import com.hackathon.springboot.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;
    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getStockbyId(int id) {
        return stockRepository.findById(id).get();
    }

    @Override
    public List<Stock> getStockByStockTicker(String stock_ticker) {
        return stockRepository.getStockByStockTicker(stock_ticker);
    }


    @Override
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock updateStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public void deleteStock(int id) {
//        Stock entity = stockRepository.findById(id).get();
        stockRepository.delete(stockRepository.findById(id).get());
    }
}
