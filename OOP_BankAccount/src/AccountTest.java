
public class AccountTest {

	public static void main(String[] args) {
		
		/*
		Account account1 = new Account();
		
		
		account1.setAccountNo("221133");
		account1.setBalance(1200);
		account1.setEmail("myaccount@gmail.com");
		account1.setName("Tony Montana");
		account1.setPhoneNo("111111");
		
		System.out.println("Balance = " + account1.getBalance());
		*/
		
		Account account2 = new Account("12345", 1200, "Tony Montana", "myaccount@gmail.com", "11111");
		
		account2.cashDeposit(250);
		account2.withdraw(147);
		account2.withdraw(1350);
		
		System.out.println(account2.getAccountNo());
		System.out.println(account2.getName());
	}
}