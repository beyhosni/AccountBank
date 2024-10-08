package bankkata.example.bankkata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import bankkata.example.bankkata.model.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

@SpringBootTest
class BankkataApplicationTests {

	private Account account;
	
	@BeforeEach
	public void setUp() {
		account = new Account();
	}

	@Test
	public void testAbilityDepositInAccount() {
		double initialBalance = account.getBalance();
		account.deposit(1000);
		assertEquals(initialBalance +1000, account.getBalance());
	}

	@Test
	public void testAbilitytestWithdrawFromAccount() {
		account.deposit(1000);
		double initialBalance = account.getBalance();
		account.withdraw(500);
		assertEquals(initialBalance + 500, account.getBalance());
	}
/*
	@Test
	public void testPrintStatementHistory(){
		account.deposit(1000);
		account.withdraw(200);

		List<Operation> statement = account.getOperations();

	assertEquals(2, statement.size());
	assertEquals("DEPOSIT" ,statement.get(0).getType(), "Deposit Operation");
	assertEquals("WITHDRAWAL",statement.get(1).getType(), "WITHDRAWAL Operation" );
	}
*/
	@Test
	public void testInsufficientBalance(){
		account.deposit(500);
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1000);
        });
        assertEquals("Insufficient balance", thrown.getMessage(), "Withdrawal should throw an exception for insufficient balance.");

	}

}
