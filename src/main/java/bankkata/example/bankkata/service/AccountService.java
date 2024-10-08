package bankkata.example.bankkata.service;


import bankkata.example.bankkata.model.*;
import org.springframework.stereotype.*;
import java.util.List;



@Service
public class AccountService {
    private Account account = new Account();

    public void deposit (double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount){
        account.withdraw(amount);
    }

    public List<Operation> getStatement() {
        return account.getOperations();
    }

    public double getBalance() {
        return account.getBalance();
    }
}