package com.hackathon.springboot.services;

import com.hackathon.springboot.entities.PortfolioStock;
import com.hackathon.springboot.entities.Stock;
import com.hackathon.springboot.repositories.PortfolioStockRepository;
import com.hackathon.springboot.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PortfolioStockServiceImpl implements PortfolioStockService {

    @Autowired
    private PortfolioStockRepository portfolioStockRepository;
    @Override
    public List<PortfolioStock> getAllPStocks() {
        return portfolioStockRepository.findAll();
    }

    @Override
    public PortfolioStock getPStockbyId(int id) {
        return portfolioStockRepository.findById(id).get();
    }

    @Override
    public List<PortfolioStock> getPStockByStockTicker(String stock_ticker) {
        return portfolioStockRepository.getPStockByStockTicker(stock_ticker);
    }


    @Override
    public PortfolioStock addPStock(PortfolioStock portfolioStock) {
        return portfolioStockRepository.save(portfolioStock);
    }

    @Override
    public PortfolioStock updatePStock(PortfolioStock portfolioStock) {
        return portfolioStockRepository.save(portfolioStock);
    }

    @Override
    public void deletePStock(int id) {
//        Stock entity = stockRepository.findById(id).get();
        portfolioStockRepository.delete(portfolioStockRepository.findById(id).get());
    }
}
