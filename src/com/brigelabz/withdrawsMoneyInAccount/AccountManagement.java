package com.brigelabz.withdrawsMoneyInAccount;

import java.util.Scanner;

public class AccountManagement {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        withdrawsMoney();
    }

    private static void withdrawsMoney() {
        System.out.println("Enter the Withdraws Money");
        double money = scanner.nextDouble();
        Account account = new Account();
        double actualAccountBalance = account.getMainBalanceOfAccount() - money;
        account.setMainBalanceOfAccount(actualAccountBalance);
        System.out.println("Now your account balance is "+account.getMainBalanceOfAccount());
    }
}
