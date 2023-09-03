package com.example.jumia.data.models;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first Number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println(secondNumber);

        int square = 1;

        for (int i = 0; i < secondNumber; i++) {
            square = square * firstNumber;
        }

        System.out.println(square);

    }
}
