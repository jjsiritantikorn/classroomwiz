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
	this.coins = c ;
	
		
	}
	
	/*
	 * Method that adds a specific coin (Quarter, Dime, Nickel, Penny) 
	 * to the current Purse object
	 * @param coinName - the coin to be added to the purse 
	 */
	public void addCoin(String coinName)
	{
		coins.add(coinName);
		
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
		for(int i = coins.size()-1; i>=0; i--){
			coins.add(coins.get(i));
			coins.remove(i);
			}
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
		for(int i = 0; i < other.coins.size(); i++){
			this.coins.add(0,other.coins.get(i));
			other.coins.remove(i);
					}
	
	}
	
	/*
	 * Checks whether the other purse has the same coins in the same order 
	 * 
	 */
	public boolean sameContents(Purse other)
	{
		int i = 0;
		while(i < this.coins.size()){
			if(this.coins.get(i) == other.coins.get(i)){
				i++;
			}
		}
		if(i == this.coins.size()){
			return true;
		}
		else{
			return false;
		}
		
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
		int q1 = 0;
		int d1 = 0;
		int p1 = 0;
		int n1 = 0;
		int q2 = 0;
		int d2 = 0;
		int p2 = 0;
		int n2 = 0;
		
		for(int i =0; i <this.coins.size();i++){
			if(this.coins.get(i) == "Quarter"){
				q1++;
			}
			if(this.coins.get(i) == "Nickel"){
				n1++;
			}
			if(this.coins.get(i) == "Dime"){
				d1++;
			}
			if(this.coins.get(i) == "Penny"){
				p1++;
			}
		}
		for(int i =0; i <other.coins.size();i++){
			if(this.coins.get(i) == "Quarter"){
				q2++;
			}
			if(this.coins.get(i) == "Nickel"){
				n2++;
			}
			if(this.coins.get(i) == "Dime"){
				d2++;
			}
			if(this.coins.get(i) == "Penny"){
				p2++;
			}
		}
		if(q1 == q2 && d1 == d2 && n1==n2 && p1==p2){
			return true;
		}
		
		else{
			return false;
		}
		
	}
	
	
	

}
