package com.example.nguyenquanghuy2009a.service;

import com.example.nguyenquanghuy2009a.entity.Stock;
import com.example.nguyenquanghuy2009a.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServicelmpl implements StockService {

    @Autowired
    Repo repo;

    @Override
    public List<Stock> getStockName() {
        return repo.StockRepository.findAll();();
    }

    public List<Stock> getStockPrice() {
        return repo.findPriceBySymbol();
    }

