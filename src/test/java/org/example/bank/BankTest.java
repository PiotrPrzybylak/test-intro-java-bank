package org.example.bank;

import org.junit.jupiter.api.Test;

import static org.example.Main.testAmount;
import static org.example.Main.testCondition;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void test() {
        Bank bank = new Bank();

        bank.createAccount("PL123");
        assertEquals(0, bank.getAmount("PL123"), "Wrong amount returned");

        bank.deposit("PL123", 30);
        float result = bank.getAmount("PL123");
        assertEquals(30, result, "Wrong amount returned");

        bank.deposit("PL123", 15);
        result = bank.getAmount("PL123");
        assertTrue(result == 45);

        bank.createAccount("PL456");
        bank.deposit("PL456", 15);
        result = bank.getAmount("PL456");
        assertEquals(15, result, "Wrong amount returned");


        result = bank.getAmount("PL123");
        assertEquals(45, result, "Wrong amount returned");
    }

}