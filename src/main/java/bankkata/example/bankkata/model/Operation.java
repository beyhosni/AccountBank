package bankkata.example.bankkata.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
public class Operation {
    private LocalDate date;
    private String type;
    private BigDecimal amount;
    private BigDecimal balanceAfterOperation;
}

}