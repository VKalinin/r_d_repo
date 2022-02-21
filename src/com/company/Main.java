package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите любое целое число:");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int d = keyboard.nextInt();
        int Sum1 = a + b;
        int Sum2 = c + d;
        boolean b1 = Sum1 > Sum2;
        System.out.println(b1);
        int Sum3 = Sum1 + 1;
        int Sum4 = Sum2 - 2;
        boolean b2 = Sum3 > Sum4;
        System.out.println(b2);
        if (Sum3 % 2 == 0 || Sum4 % 2 == 0) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

