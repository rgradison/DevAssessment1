package com.zyberfox.gdc;

import java.util.Scanner;

public class GDCTest {
    //Example one
    public static void main(String[] args) {

       /*int[] numbers = new int[]{2,7,8,9,3,15};
        int[] b = new int[m];
        System.out.println("length is " + b.length);
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
            System.out.println(b[b_i]);
        */
        //}
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
