package com.example.demo.controllers;

import com.example.demo.service.ActiveMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WarehouseController {

    @Autowired
    private ActiveMqProducer activeMqProducer;
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("warehouses")
    public String getAllWarehouses(@RequestParam String email){

        // Call the external service and map the response to a List<Integer>
        String response =  restTemplate.getForObject("http://0.0.0.0:8082/get-warehopuses-python", String.class);
        return response;
    }

    @GetMapping("update-inventory")
    public String getAllWarehousesV2(@RequestParam String email){
        //store the update in DB
        activeMqProducer.sendMessage(email);
        return "Updated sucesfully";
    }


    //this will send a message to queue
    @GetMapping("/send-message")
    public String sendMessage(@RequestParam String message) {
        activeMqProducer.sendMessage(message);
        return "Message sent: " + message;
    }
}
