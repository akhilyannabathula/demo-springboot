package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WarehouseController {

    @GetMapping("warehouses")
    public List<Integer> getAllWarehouses(){
        ArrayList<Integer> warehouses = new ArrayList<>();
        warehouses.add(123);
        warehouses.add(456);
        warehouses.add(789);
        return warehouses;
    }
}
