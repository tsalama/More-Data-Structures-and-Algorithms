import java.util.ArrayList;

public class Bank implements Iterable<BankAccount> {

	public static void main(String[] args) {
		
		BankAccount accounts1 = new BankAccount();
		double i = 0.0;
		int count = 0;
		
		for (BankAccount bank : accounts1)
		    {
			while(i < 6.0)
			accounts1.addInterest(i);
		    }
		    
		System.out.println(accounts1);
	}	
}
