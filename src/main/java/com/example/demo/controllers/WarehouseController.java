package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WarehouseController {

    @GetMapping("warehouses")
    public String getAllWarehouses(){
        return "123,356,789";
    }
}
