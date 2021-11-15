package com.melibo;

import com.melibo.services.*;

public class HelloWorld {
    public static void main(String[] args) {
        AddService addService = new AddService();
        // Ausgabe Hello World!
        //int number = Integer.parseInt(System.getenv("NUMBER"));
        int sum = addService.add(5, 6);
        System.out.println("Sum of " + 5 + " and 6 is: " + sum);
    }
}
