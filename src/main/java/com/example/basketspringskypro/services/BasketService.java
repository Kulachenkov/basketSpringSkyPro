package com.example.basketspringskypro.services;

import org.springframework.context.annotation.Scope;

import java.util.Collection;
import java.util.List;

public interface BasketService {
    void add(List<Integer> id);

    List<Integer> get();

}
