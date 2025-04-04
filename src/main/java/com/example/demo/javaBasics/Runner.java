package com.example.demo.javaBasics;

import java.math.BigInteger;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
    Dog d= new Dog();
    d.speak();


    Employee developer= () ->{ System.out.println("develops code"); };
    developer.work();

    Employee manager= () ->{ System.out.println("Manager is managing"); };
    manager.work();

    //in-built functional interfaces

        //1. Consumer -- takes 1 parameter and process input no return
        //            -- has void accept(T t);
        //               Ex: for Logging, for DB updates
        Consumer<String> c=(name) -> {
            System.out.println(name);};

        c.accept("hem from consumer");
//---------------------

       //2. Supplier -- takes no input, but "returns"
       //            -- has .get();
       //               Ex: to supply DB connections without input parameter, to get time
        Supplier oneSupplier= () -> {
            return 1;
        };
        System.out.println(oneSupplier.get());

        Supplier dbconnectionSupplier= () ->{
            return "dbConnections";
        };
        System.out.println(dbconnectionSupplier.get());

        Supplier time = () -> LocalTime.now();
        System.out.println(time.get());
//---------------------
    /*
    Predicate -- accepts argument and returns Boolean
              -- helps in filtering
              -- has .test(T t)
    */
        Predicate<Integer> p= (num) ->{
            if(num % 2 == 0) return true;
            else return false;
        };

        System.out.println(p.test(5));

//-------------------
       /*
       Function - takes input and returns value
                - .apply(T t)
       */
        Function<String,Integer> convertStringToInt = (String value)->{
            return Integer.parseInt(value);
        };
        System.out.println( convertStringToInt.apply("1") );

    }


}

