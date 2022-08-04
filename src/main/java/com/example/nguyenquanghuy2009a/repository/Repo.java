package com.example.nguyenquanghuy2009a.repository;

import com.example.nguyenquanghuy2009a.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Repo extends JpaRepository<Stock, Integer> {
    List<Stock> findAll(String name);

    @Query(value = "select name from Stock where symbol like %:symbol%", nativeQuery = true)
    List<String> findNameBySymbol(String symbol);

    @Query(value = "select price from Stock where symbol like %:symbol%", nativeQuery = true)
    List<Double> findPriceBySymbol(String symbol);

    Stock findBySymbol(String name);
}
