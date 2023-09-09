package com.example.jumia;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers you will enter");
        int range = scanner.nextInt();


        int count = 1;
        System.out.println("Enter first Number");
        int maxInput = scanner.nextInt();


        for (int i = count; i <=  range; i++) {
            System.out.println("enter number "+ i);
            int userInput = scanner.nextInt();

            if (userInput > maxInput){
                maxInput = userInput;
            }
        }

        System.out.println("max number is "+maxInput);
    }
}
