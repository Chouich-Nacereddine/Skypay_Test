package service;

import java.time.LocalDate;

// I created this Class because i see that we have to create a new type that can have a Date value and an Amount one and also a balance one
// this will help us when we want to store and print the Statement or transactions
public class Statement {
    public final LocalDate date;
    public final int amount;
    public final int balance;

    public Statement(LocalDate date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }
}