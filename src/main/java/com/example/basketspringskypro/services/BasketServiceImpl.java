package com.example.basketspringskypro.services;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService{
    private List<Integer> basket;

    public BasketServiceImpl(List<Integer> basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Integer> id) {
        basket.addAll(id);
    }

    @Override
    public List<Integer> get() {
        return basket;
    }
}
