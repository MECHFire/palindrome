package palindrome;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PalindromeTest {
	
	@Test
	public void isMyNameYoursSpeltBackwardsTest(){
		String NameOne = "abc";
		String Nametwo = "cba";
		
		String NameBadOne = "abc";
		String NameBadTwo = "bcd";
		
		String NameEmpty = "";
		String NameNull = null;
		
		PalindromeCheck p = new PalindromeCheck(); 
		
		assertTrue(p.isMyNameYourNameBackwards(NameOne, Nametwo));
		assertFalse(p.isMyNameYourNameBackwards(NameBadOne, NameOne));
		assertFalse(p.isMyNameYourNameBackwards(NameBadTwo, NameOne));
		assertFalse(p.isMyNameYourNameBackwards(NameEmpty, NameOne));
		assertFalse(p.isMyNameYourNameBackwards(NameNull, NameOne));
		assertFalse(p.isMyNameYourNameBackwards(NameOne, NameEmpty));
		assertFalse(p.isMyNameYourNameBackwards(NameOne, NameNull));
	}
	
	@Test
	public void isMyNameAPalindromeWhenIaddYours(){
		String NameOne = "abc";
		String Nametwo = "cba";
		
		String NameBadOne = "abc";
		String NameBadTwo = "bcd";
		String ShortName = "a";
		
		PalindromeCheck p = new PalindromeCheck(); 
		
		assertTrue(p.isMyNameAPalindromeWhenIaddYours(NameOne, Nametwo));
		assertFalse(p.isMyNameAPalindromeWhenIaddYours(NameBadOne, NameOne));
		assertFalse(p.isMyNameAPalindromeWhenIaddYours(NameBadTwo, NameOne));
		assertFalse(p.isMyNameAPalindromeWhenIaddYours(ShortName, NameOne));
	}
	
	@Test
	public void letsCheckIfOurNamesArePalindromesTest(){
		ArrayList<String> names = new ArrayList<String>(); 
		//Gimli Fili Ilif Ilmig and Mark
		names.add("Gimli");
		names.add("Fili");
		names.add("Ilif");
		names.add("Ilmig");
		names.add("Mark");
		
		PalindromeCheck p = new PalindromeCheck();
		
		p.checkIfOurNamesArePalindromes(names);
		//We expect two palindromes back from the names entered.
		assertTrue(p.checkIfOurNamesArePalindromes(names).size() == 2);
	}

}
