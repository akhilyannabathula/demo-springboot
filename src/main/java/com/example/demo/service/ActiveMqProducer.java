package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ActiveMqProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    private static final String QUEUE_NAME = "my-queue";

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(QUEUE_NAME, message);
        System.out.println("Sent message: " + message);
    }
}
