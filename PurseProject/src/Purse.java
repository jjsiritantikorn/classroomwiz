import java.util.ArrayList;
import java.util.Arrays;


public class Purse {
	
	//ArrayList that contains the coins 
	private ArrayList<String> coins;
	
	//constructor that initializes empty purse 
	public Purse()
	{
		coins = new ArrayList<String>();
	}
	
	//constructor that initializes the purse with the coins passed in
	public Purse(ArrayList<String> c)
	{
	coins = c;
	
		
	}
	
	/*
	 * Method that adds a specific coin (Quarter, Dime, Nickel, Penny) 
	 * to the current Purse object
	 * @param coinName - the coin to be added to the purse 
	 */
	public void addCoin(String coinName)
	{
		coins.add(coinName);
		System.out.println(this.toString());
	}
	
	/*
	 * Returns the String representation of the purse 
	 * in the format of 
	 * Purse[Quarter,Dime,Nickel,Dime] 
	 * coins are separated by commas and contain no spaces.
	 * The list of coins is surrounded by square brackets 
	 * and is preceded by the word Purse 
	 */
	public String toString()
	{
		
		if(coins.size() == 0){
			return ("Purse[]");
		}
		String pre = ("Purse[");
	for(int i = 0; i < coins.size(); i++){
		if(i == coins.size()-1){
			 pre += (coins.get(i));
		}
		else{
			pre += (coins.get(i)+",");
		}
    }
			pre += ("]");
			
		return pre; 
	}
	
	/*
	 * Reverses the sequence of coins in the purse
	 * For example if reverse is called with a purse
	 * Purse[Quarter,Dime,Nickel,Dime]
	 * then the purse is changed to
	 * Purse[Dime,Nickel,Dime,Quarter]
	 */
	public void reverse()
	{
		
	}
	
	/*
	 * Transfer the contents of one purse to another 
	 * For example if a is 
	 * Purse[Quarter,Dime,Nickel,Dime]
	 * and b is 
	 * Purse[Dime,Nickel]
	 * then after the call a.transfer(b), a is 
	 * Purse[Quarter,Dime,Nickel,Dime]
	 * and b is empty 
	 */
	public void transfer(Purse other)
	{
		
	}
	
	/*
	 * Checks whether the other purse has the same coins in the same order 
	 * 
	 */
	public boolean sameContents(Purse other)
	{
		return false;
	}
	
	/*
	 * checks whether the other purse has the same coins, perhaps in a different order 
	 * For example, the purses 
	 * Purse[Quarter,Dime,nickel,Dime]
	 * and 
	 * Purse[Nickel,Dime,Dime,Quarter]
	 * should be considered equal 
	 * You will probably need one or more helper method 
	 */
	public boolean sameCoins(Purse other)
	{
		return false; 
	}
	
	
	

}
