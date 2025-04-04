package com.example.demo.designPattern.singleton;

import org.springframework.core.metrics.StartupStep;

public class Runner {
    public static void main(String[] args) {

        DatabaseConnection databaseConnection1 = DatabaseConnection.getDatabaseConnection();
        System.out.println(databaseConnection1);

        DatabaseConnection databaseConnection2 = DatabaseConnection.getDatabaseConnection();
        System.out.println(databaseConnection2);

        //prints true as both are equal
        System.out.println(databaseConnection1.equals(databaseConnection2));
    }
}
