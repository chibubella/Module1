
public class SavingsAcct {
	
	//private String name;
	private double balance; //balance for the instance of savings acct
	private static double allBal;
	
	public  void deposit(double amount) { //add amount to existing balance
		balance += amount;
		allBal += amount;
	}
	
	public double withdraw (double amount) { //reduce balance by amount and return current balance
		balance -= amount;
		allBal -= amount;
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static double getAllBal() {
		return allBal;
	}
	
	
}
