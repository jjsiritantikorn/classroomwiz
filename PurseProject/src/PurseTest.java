import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class PurseTest {
	
	private Purse p1;
	private Purse p2;
	private String quarter = "Quarter";
	private String dime = "Dime";
	private String nickel = "Nickel";
	private String penny = "Penny";
	
	public PurseTest(){
		
	}
	@Before
	public void setup()
	{
		p1 = new Purse();
		ArrayList<String> input = new ArrayList<String>(Arrays.asList("Quarter", "Dime","Nickel","Quarter"));
		p2 = new Purse(input);
		
	}

	@Test
	public void test() {
		assertEquals("Make sure your format is exactly as described in the toString", "Purse[Quarter,Dime,Nickel,Quarter]", p2.toString());
		assertEquals("Empty purse should still have a valid toString","Purse[]", p1.toString());
	}
	
	@Test
	public void testAddCoin() {
		assertEquals("Purse should now .equals \"Purse[Quarter]\" ", "Purse[Quarter]", p1.toString());
		p1.addCoin(dime);
		assertEquals("Purse should now .equals \"Purse[Quarter,Dime]\" ", "Purse[Quarter,Dime]", p1.toString());
		p1.addCoin(penny);
		assertEquals("Purse should now .equals \"Purse[Quarter,Dime,Penny]\" ", "Purse[Quarter,Dime,Penny]", p1.toString());
		p1.addCoin(nickel);
		assertEquals("Purse should now .equals \"Purse[Quarter,Dime,Penny,Nickel]\" ", "Purse[Quarter,Dime,Penny,Nickel]", p1.toString());
		
	}
	
	@Test
	public void testReverse() {
		assertEquals("Make sure your format is exactly as described", "Purse[Quarter,Nickel,Dime,Quarter]", p1.reverse());
	}
	@Test
	public void testTransfer() {
		assertEquals("This purse should now have the other purse contents in it","Purse[Quarter,Dime,Nickel,Quarter]",p1.transfer(p2));
	}
	@Test
	public void testSameContents(){
		assertEquals("This purse should have the same contents as the tested purse","False",p1.sameContents(p2));
	}
	@Test
	public void testSameCoins(){
		assertEquals("This purse should have the same type of coins as the tested purse","False",p1.sameContents(p2));
	}
	

}
