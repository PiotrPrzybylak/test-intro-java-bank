package org.example.bank;

import org.example.Main;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Float> accounts = new HashMap<>();

    public void deposit(String account, float amount) {
        accounts.put(account, accounts.get(account) + amount);
    }

    public float getAmount(String account) {
        return accounts.get(account);
    }

    public void createAccount(String account) {
        accounts.put(account, 0.0f);
    }
}
