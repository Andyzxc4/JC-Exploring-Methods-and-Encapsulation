package org.example;

import java.util.Arrays;

public class VarargsExample {

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println(" ");
    }

    public static void findLargest(int... numbers) {
        if(numbers.length == 0) {
            System.out.printf("\nLargest with no numbers is: %d ", Integer.MIN_VALUE);
        } else {
            int largestNum = numbers[0];
            for(int number : numbers) {
                if(number > largestNum) {
                    largestNum = number;
                }
            }
            System.out.printf("\nLargest in %s: %d ", Arrays.toString(numbers), largestNum);
        }
    }

}
