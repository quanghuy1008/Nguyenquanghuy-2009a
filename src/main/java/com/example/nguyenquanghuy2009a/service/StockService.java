package com.example.nguyenquanghuy2009a.service;

import com.example.nguyenquanghuy2009a.entity.Stock;

import java.util.List;

public interface StockService {
    List<Stock> getAllStock();

    List<Stock> getStockName();
}
