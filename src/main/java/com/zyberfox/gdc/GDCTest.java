package com.zyberfox.gdc;

import java.util.Scanner;

public class GDCTest {
    //Example one
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 =scanner.nextInt();

        System.out.println("Enter the second number");
        int number2 =scanner.nextInt();

        System.out.println("Enter the third number");
        int number3 =scanner.nextInt();

        int hcf =1;
        int i=2;

        while (i <= number1 && i <= number2 && i <= number3   ) {
            if (number1%i == 0 && number2%i == 0 && number3%i == 0) {
                hcf=i;
            }
            i++;
        }
        System.out.println("The highest common factor for the numbers isv " + hcf);
    }
}
