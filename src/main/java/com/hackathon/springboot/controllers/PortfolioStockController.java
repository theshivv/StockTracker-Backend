package com.hackathon.springboot.controllers;


import com.hackathon.springboot.entities.PortfolioStock;
import com.hackathon.springboot.entities.Stock;
import com.hackathon.springboot.services.PortfolioStockService;
import com.hackathon.springboot.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PortfolioStockController {


    @Autowired
    private PortfolioStockService portfolioStockService;
    @RequestMapping(path = "/p", method = RequestMethod.GET)
    public String helloPortfolio(){
        return "Portfolio Hello";
    }

    @RequestMapping(path = "/pstocks", method = RequestMethod.GET)
    public List<PortfolioStock> getStocks(){
        return portfolioStockService.getAllPStocks();
    }

    @RequestMapping(path = "/pstocks/stockticker/{stock_ticker}", method = RequestMethod.GET)
    public List<PortfolioStock> getStocksByStockTicker(@PathVariable String stock_ticker){
        return portfolioStockService.getPStockByStockTicker(stock_ticker);
    }

    @RequestMapping(path = "/pstocks/stockquantity/{stock_ticker}", method = RequestMethod.GET)
    public Integer getStockQuantityByStockTicker(@PathVariable String stock_ticker){
        return portfolioStockService.getStockQuantityByStockTicker(stock_ticker);
    }

    @RequestMapping(path = "/pstocks/id/{id}", method = RequestMethod.GET)
    public PortfolioStock getStockbyID(@PathVariable String id){
        return portfolioStockService.getPStockbyId(Integer.parseInt(id));
    }





    @RequestMapping(path = "/pstocks", method = RequestMethod.POST)
    public PortfolioStock addStock(@RequestBody PortfolioStock portfolioStock){
        return portfolioStockService.addPStock(portfolioStock);
    }

    @RequestMapping(path = "/pstocks", method = RequestMethod.PUT)
    public PortfolioStock updateStock(@RequestBody PortfolioStock portfolioStock){
        return portfolioStockService.updatePStock(portfolioStock);
    }

    @RequestMapping(path = "/pstocks/{id}", method = RequestMethod.DELETE)
    public void deleteStock(@PathVariable String id){
        portfolioStockService.deletePStock(Integer.parseInt(id));
    }
}
