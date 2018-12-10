package OneTwoThreeBet;

import java.util.Random;

public class BetGame {
	
	//Creates a new balance
	AddToBalance balance = new AddToBalance();
	
	// Identifier 
	public int randomNum;
	public int guess;
	public double bet;
	public double total;
	public String result;
	
	// Constructor
	public BetGame() {
		
	}

	// Accessor Method
	public int getRandomNum() {
		return randomNum;
	}
	
	public int getGuess() {
		return guess;
	}
	
	public double getBet() {
		return bet;
	}
	
	public double total() {
		return total;
	}
	
	public String result() {
		return result;
	}
	
	// Mutator Method
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}
	
	public void setGuess(int guess) {
		this.guess = guess;
	}
	
	public void setBet(double bet) {
		this.bet = bet;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	// Play Game Method
		public void playGame(int guessNumber, double betNum) {
			
			// Generates a random number
			Random rand = new Random();
			int random = rand.nextInt(3) + 1;
			
			// Checks to see if you won
			if (random == guessNumber) {
				balance.addBalance(betNum);
				result = "You Won!";
				
			} else if (random != guessNumber) {
				balance.subtractBalance(betNum);
				result = "You lost!";
			}
			
			// Assigning user input to variables in the class BetGame
			this.randomNum = random;
			this.guess = guessNumber;
			this.bet = betNum;
		}
		
		// Makes sure the balances match up
		public void balanceMatchup(double totalBalance) {
			balance.addBalance(totalBalance);
		}
		
		// Checks to see if your bet amount is more than you have
		public boolean betCheck(double bet) {
			if (balance.getBalance() >= bet && balance.getBalance() != 0) {
				return true;
			} else
				return false;
		}
		
	@Override
	public String toString() {
		return "*************\n"+ "Random Number: " + randomNum + "\n" + "Guess Number: " + guess + "\n" + "Bet Amount: " + bet +
				"\n" + result + "\n" + "Your Balance: " + balance + "\n" + "*************\n";
	}

}
