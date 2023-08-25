package com.hackathon.springboot.repositories;

import com.hackathon.springboot.entities.PortfolioStock;
import jdk.jfr.Timestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface PortfolioStockRepository extends JpaRepository<PortfolioStock, Integer> {

    @Query(value="select * from portfolio_stock where stock_ticker= :stock_ticker", nativeQuery = true)
    List<PortfolioStock> getPStockByStockTicker(@Param("stock_ticker") String stock_ticker );

    @Query(value="select sum(quantity) from portfolio_stock where stock_ticker= :stock_ticker", nativeQuery = true)
    Integer getStockQuantityByStockTicker(@Param("stock_ticker") String stock_ticker );

    @Query(value="select id, stock_ticker, sum(quantity) AS quantity, (sum(price * quantity ) /sum(quantity) ) AS price , time_stamp  from portfolio_stock where stock_ticker IN  (select DISTINCT stock_ticker from portfolio_stock ) GROUP BY stock_ticker", nativeQuery = true)
    List<PortfolioStock> getHoldings();

    @Query(value="select sum(quantity * price) as total_investment from portfolio_stock",nativeQuery = true)
    Integer getTotalInvestment();

    @Query(value = "select stock_ticker , sum(quantity*price) as investment from portfolio_stock where stock_ticker in (select distinct stock_ticker from portfolio_stock) group by stock_ticker", nativeQuery = true)
    List<Object[]> getStockInvestmentByStockTicker();
}


