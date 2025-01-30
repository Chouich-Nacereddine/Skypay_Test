package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private final List<Statement> statements = new ArrayList<>(); // I am using an ArrayList here to store every
                                                                  // transaction the user can do when he communicat with
                                                                  // the account class or we can say when he have a
                                                                  // valide acount
    private int balance = 0; // I did this since here that a user account shoold have 0 at his sold when the
                             // account class is instantiated

    @Override // I use Override to specify that this methode is override from an interface
              // "AccountService interface in this case"
    public void deposit(int amount) {
        balance += amount; // here we are adding the amount value to the previous balance value
                           // "balance = balance + amount"
        statements.add(new Statement(LocalDate.now(), amount, balance)); // here we store the transaction into the
                                                                         // ArrayList
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;// "balance = balance - amount"
        statements.add(new Statement(LocalDate.now(), -amount, balance));// here we store the transaction into the
                                                                         // ArrayList
    }

    // this function is to display the transaction form the statements ArrayList by
    // maping trow every element in the ArrayList
    @Override
    public void printStatement() {
        System.out.println("Date       | Amount | Balance"); // this is just the first line to display. it Shows the
                                                             // Attributes
        for (int i = 0; i < statements.size(); i++) {
            Statement state = statements.get(i);
            System.out.printf("%s | %d | %d%n", state.date, state.amount, state.balance);
        }
    }
}

// This Service shoold be injected in a controler class in a real project and in
// spring boot we can add the @Service annotation to specify the this class is a
// Service

// and we Shoold take in consideration using Transactions when dealing with real
// transactions with the RollBack and commit logic

// ....