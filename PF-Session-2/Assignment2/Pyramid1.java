/*
 * This file contain class Pyramid1 which
 * contains some method to form pattern.
 */

/**
 * Pyramid1 class includes methods like
 * spaces, numbers and print which helps
 * in forming pattern.
 * @author Satyam Bhadoria
 * @version 1.0
 */
public class Pyramid1 {
	
	/**
	 * This method returns string of white-spaces
	 * as per given row number
	 * @param row
	 * @return spaceString
	 */
	protected String spaces (int row, int n) throws PatternException {
		String spaceString = "";				//holds white-spaces
		
		/*throws exception if row number is less than or equal to 0*/
		if (row < 0 || n < 0) {
			throw new PatternException ("should greater than 0");
		}
		
		/*throws exception when row number is greater than pattern number*/
		if (row > n) {
			throw new PatternException ("row number cannot be greater than pattern number");
		}
		
		/*assign white-spaces as per given row number*/
		for (int i = row; i > 1; i--) {
			spaceString += " ";
		}
		return spaceString;
	}
	
	/**
	 * This method returns string of numbers
	 * as per given row number
	 * @param row
	 * @param n
	 * @return numberString
	 */
	protected String numbers (int row, int n) throws PatternException {
		String numberString = "";				//holds numbers in increasing order
		
		/*throws exception if number is less than 0 or row number is less than or equal to 0*/
		if (n < 0 || row <= 0) {
			throw new PatternException ("should greater than 0");
		}
		
		/*throws exception when row number is greater than pattern number*/
		if (row > n)  {
			throw new PatternException ("row number cannot be greater than pattern number");
		}
		
		/*generate number string as per given row*/
		for (int i = row, j = 1; i <= n; i++, j++) {
			numberString += Integer.toString(j);
		}
		return numberString;
	}
	
	/**
	 * This method returns complete pyramid using
	 * method spaces and numbers
	 * @param n
	 * @return
	 */
	protected String[] print (int n) throws PatternException {
		String[] pyramidArray;	//store strings generated by spaces and numbers
		
		/*throws exception if number is less than 0*/
		if (n < 0) {
			throw new PatternException ("should greater than 0");
		}
		pyramidArray = new String[n];
		
		/*concatenate space and number string for each row*/
		for (int i = 0; i < n ; i++) {
			pyramidArray[i] = spaces (i + 1, n) + numbers (i + 1, n);	//assign concatenate result
		}
		return pyramidArray;
	}
}
