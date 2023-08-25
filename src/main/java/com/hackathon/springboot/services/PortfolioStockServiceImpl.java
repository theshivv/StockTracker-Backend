package com.hackathon.springboot.services;

import com.hackathon.springboot.entities.PortfolioStock;
import com.hackathon.springboot.repositories.PortfolioStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


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
    public Integer getStockQuantityByStockTicker(String stock_ticker) {
        return portfolioStockRepository.getStockQuantityByStockTicker(stock_ticker);
    }


    @Override
    public List<PortfolioStock> getHoldings(){
        return portfolioStockRepository.getHoldings();
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

    //investment
    @Override
    public Integer getTotalInvestment(){
        return portfolioStockRepository.getTotalInvestment();
    }

    @Override
    public Map<String, Double> getStockInvestmentByStockticker(){
        List<Object[]> results= portfolioStockRepository.getStockInvestmentByStockTicker();
        Map<String, Double> investments= new HashMap<>();
        for( Object[] result : results){
            String stockTicker = (String) result[0];
            Double investment = (Double) result[1];
            investments.put(stockTicker,investment);
        }

        return investments;
    }
}
