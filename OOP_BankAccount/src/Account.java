
/**
 * @author Doğan Seyfi Şen - 2022
 */

//Banka Hesap Uygulaması (Udemy)

public class Account {
	
	private String accountNo;
	private double balance;
	private String name;
	private String email;
	private String phoneNo;
	
	//Constructor metodu, Class ismi neyse o olmalı 
	
	
	public Account() {
		
	}
	
	
	public Account(String accountNo, double balance, String name, String email, String phoneNo) {
		
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	//
	
	//Para Yatırma
	public void cashDeposit(double amount) {
		balance += amount;
		
		System.out.println("New balance = " + balance);
	}
	//
	
	//Para Çekme
	public void withdraw(double amount) {
		
		if(amount > balance) {
			System.out.println("Withdraw amount can't be larger than balance. Balance = " + balance);
		}
		else if(amount > 1500) {
			System.out.println("Daily withdraw limit is not larger than 1500.");
		}
		else {
			balance -= amount;
			
			System.out.println("New balance = " + balance);
		}
	}
	//
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	
}