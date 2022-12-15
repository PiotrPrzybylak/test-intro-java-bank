package org.example.bank;

public class Bank {

    private float amount;

    public void deposit(String account, float amount) {
        this.amount += amount;
    }

    public float getAmount(String account) {
        return amount;
    }
}
