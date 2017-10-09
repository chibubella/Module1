
public class MyBank {

	public static void main(String[] args) {
		SavingsAcct s1 = new SavingsAcct();
		
		s1.deposit(150);
		System.out.println("After withdrawing $50, balance is $" +s1.withdraw(50));
		
		SavingsAcct s2 = new SavingsAcct();
		s2.deposit(500);
		s2.withdraw(200);
		System.out.println("All balances in the bank is $" + SavingsAcct.getAllBal());

	}

}
