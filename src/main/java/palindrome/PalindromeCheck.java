package palindrome;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.jmx.LoggerDynamicMBean;

public class PalindromeCheck {
	
	final static Logger logger = Logger.getLogger(PalindromeCheck.class);
	
	/**
	 * Checks to see if two names are the same if one is spelled backwards. 
	 * 
	 * @param myName
	 * @param yourName
	 * @return true if the the second name is the reverse of the first, false otherwise and if a name is null or an empty string
	 */
	public boolean isMyNameYourNameBackwards(String myName, String yourName) {
		if (myName != null && yourName != null && !yourName.isEmpty() && !myName.isEmpty()){
			logger.debug("The names: " + myName + " and: " +yourName + " will be checked");
			return myName.equalsIgnoreCase(new StringBuilder(yourName).reverse().toString());
		}
		logger.debug("An empty or null string has been passed into isMyNameYourNameBackwards");
		return false;	
	    
	}
	
	public boolean isMyNameAPalindromeWhenIaddYours(String myName, String yourName){
		boolean reverseCheck = false;
		
		if(myName.length() == yourName.length()){
			reverseCheck = isMyNameYourNameBackwards(myName, yourName);
		}
		
		if(reverseCheck){
			logger.debug(":) Yay, when I put your name and my name together we get a palindrome: " + myName + yourName);
			return true;
		}else{
			logger.debug(" :( Oh dear, when I put your name and my name together we do not get a palindrome: " + myName + yourName);
			return false;
		}	
		
	}
	
	public List<String> checkIfOurNamesArePalindromes(List<String> ourNames){
		
		List<String> palindromes = new ArrayList<String>();
		
		for (int i = 0; i < ourNames.size(); i++) {
			  for (int j = i+1; j < ourNames.size(); j++) {
				  if(isMyNameAPalindromeWhenIaddYours(ourNames.get(i), ourNames.get(j))){
					  palindromes.add(ourNames.get(i) + ourNames.get(j));
					}
			  }
			}
		
		for(String  palindrome: palindromes){
			logger.info("The palindrome: " + palindrome + " was found.");
		}
		
		return palindromes;
	}
	

}
