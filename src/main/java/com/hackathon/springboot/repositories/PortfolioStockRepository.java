package com.hackathon.springboot.repositories;

import com.hackathon.springboot.entities.PortfolioStock;
import com.hackathon.springboot.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PortfolioStockRepository extends JpaRepository<PortfolioStock, Integer> {

    @Query(value="select * from portfolio_stock where stock_ticker= :stock_ticker", nativeQuery = true)
    List<PortfolioStock> getPStockByStockTicker(@Param("stock_ticker") String stock_ticker );

    @Query(value="select sum(quantity) from portfolio_stock where stock_ticker= :stock_ticker", nativeQuery = true)
    Integer getStockQuantityByStockTicker(@Param("stock_ticker") String stock_ticker );
}
