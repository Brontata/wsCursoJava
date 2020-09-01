package entities;

public class BankAccount {
	
	private String accountNumber;
	private String name;
	private double balance;
	private static double WITHDRAW_TAX = 5;
	
	public BankAccount(String accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public BankAccount(String accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double value) {
		balance -= value + WITHDRAW_TAX;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	public String toString() {
		return "\nAccount data: " 
				+ "\nAccount: " 
				+	getAccountNumber()  
				+ ", Holder: " 
				+ getName() 
				+ ", Balance: $ " 
				+ getBalance();

	}
	
}
