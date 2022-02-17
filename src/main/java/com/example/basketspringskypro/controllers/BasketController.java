package com.example.basketspringskypro.controllers;

import com.example.basketspringskypro.services.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path = "/order")
public class BasketController {

    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/greeting")
    public String Hello() {
        return "Welcome";
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") List<Integer> id) {
        basketService.add(id);

    }
    @GetMapping(path = "/get")
    public List<Integer> get() {
        return basketService.get();

    }
}
