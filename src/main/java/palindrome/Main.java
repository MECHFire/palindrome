package palindrome;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class Main {

	final static Logger logger = Logger.getLogger(PalindromeCheck.class);
	
	public static void main(String[] args) {
		PalindromeCheck palindromeCheck = new PalindromeCheck();
		ArrayList<String> dwarfNames = new ArrayList<String>();
		int numberOfPalindromes = 0;
		//Five dwarfs named 
		dwarfNames.add("Gimli");
		dwarfNames.add("Fili");
		dwarfNames.add("Ilif");
		dwarfNames.add("Ilmig");
		dwarfNames.add("Mark");

		logger.info("At the Prancing Pony the dwarves");

		for(String name : dwarfNames){
			logger.info(name);
		}

		logger.info("Decided to to see if their names were palindromes"); 
		numberOfPalindromes = palindromeCheck.checkIfOurNamesArePalindromes(dwarfNames).size();
		logger.info("After checking it looks as if " + numberOfPalindromes + " palindromes can be created from the five dwarfs names.");

	}

}
