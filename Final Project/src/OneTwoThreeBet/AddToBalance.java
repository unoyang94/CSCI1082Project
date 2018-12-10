package OneTwoThreeBet;

public class AddToBalance {
	
	// Identifiers
	private double balance;
	
	// Constructor
	public AddToBalance() {
		
	}
	
	// Accessor Method
	public double getBalance() {
		return balance;
		
	}
	
	// Mutator Method
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	// Add to balance method
	public void addBalance(double add) {
		this.balance += add;
		
	}
	
	public void subtractBalance(double subtract) {
		this.balance -= subtract;
	}
	
	// To String Method
	public String toString() {
		
		String go = Double.toString(this.balance);
		return go;
		
	}

	
}