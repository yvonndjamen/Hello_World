package com.melibo;

import com.melibo.services.*;

public class HelloWorld {
    public static void main(String[] args) {
        AddService addService = new AddService();
        // Ausgabe Hello World!
        int number = Integer.parseInt(System.getenv("NUMBER"));
        int sum = addService.add(number, 6);
        System.out.println("Sum of " + number + " and 6 is: " + sum);
    }
}
