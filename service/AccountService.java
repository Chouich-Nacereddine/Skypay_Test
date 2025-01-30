package service;

// It Is better to use interfaces to use the Low Coupling instead of using the High Coupling so That when the APP Scale we dont change the existing code but we add a new code
public interface AccountService {

    void deposit(int amount);

    void withdraw(int amount);

    void printStatement();
}