package org.example;

import org.example.bank.Bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.createAccount("PL123");
        testAmount(bank.getAmount("PL123"), 0, 1, "Wrong amount returned");

        bank.deposit("PL123", 30);
        float result = bank.getAmount("PL123");
        testAmount(result, 30, 1, "Wrong amount returned");

        bank.deposit("PL123", 15);
        result = bank.getAmount("PL123");
        testCondition(result == 45);

        bank.createAccount("PL456");
        bank.deposit("PL456", 15);
        result = bank.getAmount("PL456");
        testAmount(result, 15, 3, "Wrong amount returned");


        result = bank.getAmount("PL123");
        testAmount(result, 45, 4, "Wrong amount returned");



    }

    private static void testAmount(float actual, float expected, int testNumber, String message) {
        if (actual != expected) {
            System.out.println("Test failed!");
            System.out.println("Test numer: " + testNumber);
            System.out.println(message);
            System.out.println("Excpected: " + expected + " but recieved: " + actual);
            System.out.println();
            throw new AssertionError(message);
        }
    }

    private static void testCondition(boolean condition) {
        if (!condition) {
            System.out.println("NOT OK");
        }
    }
}