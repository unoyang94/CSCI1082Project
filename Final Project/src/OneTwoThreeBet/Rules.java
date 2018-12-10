package OneTwoThreeBet;

public class Rules {
	
	public Rules() {
		toString();
	}
	
	public String toString()
	{
		// Displays the rules to the game
		String rules = "Rules\n"
				+ "1: Add balance\n"
				+ "2: Choose a number between 1-3\n"
				+ "3: Enter bet amount\n"
				+ "-------------------------------------------------------------------------\n"
				+ "If number picked is correct, the amount of bet will double to balance.\n"
				+ "If number picked is incorrect, the amount of bet will subtract to balance\n"
				+ "-------------------------------------------------------------------------\n";
		return rules;
	}
}
