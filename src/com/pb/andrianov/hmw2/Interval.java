package com.pb.andrianov.hmw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand;
        System.out.print("Введіть ціле число operand ");
        operand = scan.nextInt();
        if (operand >=0 && operand <=14) {
            System.out.print("operand = [0-14]");
        } else if (operand >=15 && operand <=35) {
            System.out.print("operand = [15-35]");
        } else if (operand >=36 && operand <=50) {
            System.out.print("operand = [36-50]");
        } else if (operand >=51 && operand <=100) {
            System.out.print("operand = [51-100]");
        } else if (operand <0) {
            System.out.print("operand = число не потрапило в проміжок");
        } else if (operand >100) {
            System.out.print("operand = число не потрапило в проміжок");
        }
    }
        }
