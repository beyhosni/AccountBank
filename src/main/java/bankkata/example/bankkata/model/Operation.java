package bankkata.example.bankkata.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Operation {
    private LocalDate date ;
    private String type;
    private double amount;
    private double balanceAfterOperation;



    public Operation(LocalDate date , String type ,double amount,double balanceAfterOperation){
        this.date =  date;
        this.type = type;
        this.amount = amount;
        this.balanceAfterOperation = balanceAfterOperation;
    }

}