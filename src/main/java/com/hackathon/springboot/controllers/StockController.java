package com.hackathon.springboot.controllers;

import com.hackathon.springboot.entities.Stock;
import com.hackathon.springboot.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StockController {

    @Autowired
    private StockService stockService;
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String Hello(){
        return "Hello";
    }

    @RequestMapping(path = "/stocks", method = RequestMethod.GET)
    public List<Stock> getStocks(){
        return stockService.getAllStocks();
    }

    @RequestMapping(path = "/stocks/stockticker/{stock_ticker}", method = RequestMethod.GET)
    public List<Stock> getStocksByStockTicker(@PathVariable String stock_ticker){
        return stockService.getStockByStockTicker(stock_ticker);
    }

    @RequestMapping(path = "/stocks/id/{id}", method = RequestMethod.GET)
    public Stock getStockbyID(@PathVariable String id){
        return stockService.getStockbyId(Integer.parseInt(id));
    }



    @RequestMapping(path = "/stocks", method = RequestMethod.POST)
    public Stock addStock(@RequestBody Stock stock){
        return stockService.addStock(stock);
    }

    @RequestMapping(path = "/stocks", method = RequestMethod.PUT)
    public Stock updateStock(@RequestBody Stock stock){
        return stockService.updateStock(stock);
    }

    @RequestMapping(path = "/stocks/{id}", method = RequestMethod.DELETE)
    public void deleteStock(@PathVariable String id){
        stockService.deleteStock(Integer.parseInt(id));
    }
}
