package org.example;

import org.example.bank.Bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.deposit("PL123", 30);
        float result = bank.getAmount("PL123");
        testCondition(result == 30);

        bank.deposit("PL123", 15);
        result = bank.getAmount("PL123");
        testCondition(result == 45);

        bank.deposit("PL456", 15);
        result = bank.getAmount("PL456");
        testCondition(result == 15);

        result = bank.getAmount("PL123");
        testCondition(result == 45);

    }

    private static void testCondition(boolean condition) {
        if (!condition){
            System.out.println("NOT OK");
        }
    }
}