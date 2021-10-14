package com.pb.andrianov.hmw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign = "+"; // + - * /
        System.out.print("Введіть ціле число operand1 ");
        operand1 = scan.nextInt();
        System.out.print("Введіть ціле число operand2 ");
        operand2 = scan.nextInt();
        System.out.print("Введіть знак арифметичної операції sign ");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println("operand1 + operand2 = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("operand1 - operand2 = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("operand1 * operand2 = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Помилка");
                } else {
                System.out.println("operand1 / operand2 = " + (operand1 / operand2));
                }
                break;
        }
    }
}
