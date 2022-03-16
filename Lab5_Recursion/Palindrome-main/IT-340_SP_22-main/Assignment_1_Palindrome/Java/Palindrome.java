
public class Palindrome {
	
	/*
	 * Implement this method and return true if the word is the same 
	 * forward and backwards
	 * Do not use automatic methods for reversing the string
	 */
	private boolean isPalindrome(String word) {

		if(word.length() == 0 || word.length() == 1)
			return true;
		if(word.charAt(0) == word.charAt(word.length()-1))
			return isPalindrome(word.substring(1, word.length()-1));
		else
			return false;
	}



	/*
	 * Open up  the file. 
	 * Break into words 
	 *  print out all Palindromes
	 */
	private void findAllPalindromes(String fileName) {
		

	}


	public Palindrome() {
		//run some tests

		if (isPalindrome("racecar")) {
		    System.out.print("pass");
		}
		else {
			 System.out.print("Fail");
		}
		if (isPalindrome("mom")) {
			  System.out.print("pass");
					}
		else {
			 System.out.print("Fail");
		}
		if (isPalindrome("noon")) {
			  System.out.print("pass");
					}
		else {
			 System.out.print("Fail");
		}
				
			}

	public static void main(String[] args) {
		new Palindrome();

	}

}
