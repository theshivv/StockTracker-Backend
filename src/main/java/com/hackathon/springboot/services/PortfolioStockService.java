package com.hackathon.springboot.services;

import com.hackathon.springboot.entities.PortfolioStock;
import com.hackathon.springboot.entities.Stock;

import javax.sound.sampled.Port;
import java.util.List;

public interface PortfolioStockService {

    public List<PortfolioStock> getAllPStocks();

    public PortfolioStock getPStockbyId(int id);

    public List<PortfolioStock> getPStockByStockTicker(String stock_ticker);

    public PortfolioStock addPStock(PortfolioStock portfolioStock);

    public PortfolioStock updatePStock(PortfolioStock portfolioStock);

    public void deletePStock(int id);
}
