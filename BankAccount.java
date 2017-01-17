import java.util.ArrayList;

public class BankAccount{
	
	private ArrayList<Double> accounts;
	
	public BankAccount(){
		accounts = new ArrayList<Double>();
	}
	
	public void addInterest(double i){
		accounts.add(i);
	}
}
