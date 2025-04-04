package com.example.demo.designPattern.singleton;


import java.util.function.Predicate;

public class DatabaseConnection {

    //steps to create singleton class
    //make constructor private
    //since constructor is private you cannot create an object outside this class
    //so create one more static method inside the class which creates the object and return it
    //make all the setters private
    //should only contain getters


    //why static? cuz we need to access this in a static function below
    static DatabaseConnection databaseConnection=null;

    private DatabaseConnection(){
    }

    //static method to create database connection
    //why static? cuz we can call this function without creating a DatabaseConnection object
    public static DatabaseConnection getDatabaseConnection() {
        //if databaseConnection is not available then only create a new one
        if(databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
            return databaseConnection;
        }
        //means databaseConnection is already existing so return it
        else{
            return databaseConnection;
        }
    }
}
