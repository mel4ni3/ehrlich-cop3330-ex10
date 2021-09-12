/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {
        int quant1, quant2, quant3;
        float total = 0, price1, price2, price3, tax, res;

        Scanner s = new Scanner(System.in);

            System.out.print("Enter the price of item 1: ");
            price1 = s.nextFloat();
            System.out.print("Enter the quantity of item 1:");
            quant1 = s.nextInt();
            System.out.print("Enter the price of item 2:");
            price2 = s.nextFloat();
            System.out.print("Enter the quantity of item 1");
            quant2 = s.nextInt();
            System.out.print("Enter the price of item 3:");
            price3 = s.nextFloat();
            System.out.print("Enter the quantity of item 1:");
            quant3 = s.nextInt();


        total += (price1 * quant1);
        total += (price2 * quant2);
        total += (price3 * quant3);


        tax = (float) (total * 5.5)/100;
        res = tax +  total;
        System.out.print("Subtotal: $" + total + "\nTax: $" + tax + "\nTotal: $" + res);
    }
}