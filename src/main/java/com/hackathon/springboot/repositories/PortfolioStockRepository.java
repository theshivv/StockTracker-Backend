package com.hackathon.springboot.repositories;

import com.hackathon.springboot.entities.PortfolioStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PortfolioStockRepository extends JpaRepository<PortfolioStock, Integer> {

    @Query(value="select * from portfolio_stock where stock_ticker= :stock_ticker", nativeQuery = true)
    List<PortfolioStock> getPStockByStockTicker(@Param("stock_ticker") String stock_ticker );

    @Query(value="select sum(quantity) from portfolio_stock where stock_ticker= :stock_ticker", nativeQuery = true)
    Integer getStockQuantityByStockTicker(@Param("stock_ticker") String stock_ticker );

    @Query(value="select id, stock_ticker, sum(quantity) AS quantity, (sum(price * quantity ) /sum(quantity) ) AS price , time_stamp  from portfolio_stock where stock_ticker IN  (select DISTINCT stock_ticker from portfolio_stock ) GROUP BY stock_ticker", nativeQuery = true)
    List<PortfolioStock> getHoldings( );
}
