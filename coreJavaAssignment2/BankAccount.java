package coreJavaAssignment2;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;

	public BankAccount(int accountNumber, double balance, String customerName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ "]";
	}
	
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(1234, 3000.0, "Sreelash Sk");
		System.out.println(ba1);
		System.out.println("**************************************************************************");
		System.out.println("Modified BankAccount Object is,");
		ba1.setBalance(6000.0);
		ba1.setCustomerName("Suraj");
		System.out.println(ba1);
	}

}
