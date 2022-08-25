package com.brigelabz.stockAccountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class stockPortfolio {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Stock> portfolio = new ArrayList<>();

    public static void shareName() {
        Stock stock = new Stock();
        System.out.println("Enter the  Name of share ");
        String shareName = scanner.next();
        stock.setStockName(shareName);
        System.out.println("Enter the number of share you have Buy");
        int numberOfShare = scanner.nextInt();
        stock.setNumberOfShare(numberOfShare);
        System.out.println("Enter the Price of share");
        double priceOfShare = scanner.nextDouble();
        stock.setSharePrice(priceOfShare);
        stock.setTotalValue(numberOfShare*priceOfShare);
        portfolio.add(stock);
        System.out.println("Successfully save the share in your Portfolio");
    }

    public static void multiplyShare() {
        System.out.println("how many stock is adding in your Portfolio");
        int numberOfStock = scanner.nextInt();
        for (int i = 1; i <= numberOfStock; i++) {
            shareName();
        }
    }
    public static void displayPortfolio(){
        System.out.println();
        System.out.println("..................Portfolio....................");
        for (int i = 0; i < portfolio.size(); i++) {
            System.out.println(portfolio.get(i));
        }
    }
}
