package bankkata.example.bankkata.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Account {

    private double balance;
    private List<Operation> operations;


    public Account(){
        this.balance = 0;
        this.operations = new ArrayList<>();
    }

    public void deposit(double amount){
        balance += amount;
        operations.add(new Operation(LocalDate.now(), "DEPOSIT", amount,balance));;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            operations.add(new Operation(LocalDate.now(),"WITHDRAW", amount,balance));
        } else {
            throw new IllegalArgumentException("Insufficient");
        }
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public double getBalance() {
        return balance;
    }
}