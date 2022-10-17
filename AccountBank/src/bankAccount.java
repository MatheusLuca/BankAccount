

public class bankAccount {
	
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public bankAccount(int accountNumber, String accountHolder, double initialDeposit) {

			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			this.balance = initialDeposit;

	}

	
	
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public String showBalance() {
		
		return "Account Data:\n" + "Account" + this.accountNumber + 
				", Holder: " + this.accountHolder +
				", Balance " + this.balance  ;
	}
	
	public void depositar(double deposito) {
			
		this.balance += deposito;
		
	}
	
	public void sacar (double sacar) {
		
		this.balance -= sacar;
		
	}
	
}		