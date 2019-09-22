package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDesposit) {		
		this.number = number;
		this.holder = holder;
		deposit(initialDesposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getbalance() {
		return  balance;
	}

	
	public double deposit(double amount) {
		return this.balance += amount;
	}
	
	public double withdraw(double amount) {
		return this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: " 
			    + number
				+ ", Holder: "
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
	
	

}
