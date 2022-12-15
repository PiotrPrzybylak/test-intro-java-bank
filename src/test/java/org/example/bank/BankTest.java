package org.example.bank;

import org.junit.jupiter.api.Test;

import static org.example.Main.testAmount;
import static org.example.Main.testCondition;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank = new Bank();

    @Test
    public void shouldCreateAccount() {
        bank.createAccount("PL123");
        assertEquals(0, bank.getAmount("PL123"));
    }

    @Test
    public void shouldDeposit() {
        bank.createAccount("PL123");

        bank.deposit("PL123", 30);
        float result = bank.getAmount("PL123");
        assertEquals(30, result);
    }

    @Test
    public void shouldDepositTwice() {
        bank.createAccount("PL123");
        bank.deposit("PL123", 30);
        bank.deposit("PL123", 15);
        float result = bank.getAmount("PL123");
        assertEquals(45, result);
    }


    @Test
    public void shouldDepositOnDifferentAccounts() {
        bank.createAccount("PL123");
        bank.createAccount("PL456");
        bank.deposit("PL123", 11);
        bank.deposit("PL456", 50);
        assertEquals(11, bank.getAmount("PL123"));
        assertEquals(50, bank.getAmount("PL456"));
    }
}