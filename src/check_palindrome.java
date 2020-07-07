
public class check_palindrome {
	public static void main (String[] args) {
		String str = "yyeeeyy";
		//String str = "nooo!n";
		
		if (isPalindrome(str))
			System.out.println("Yes!");
		else
			System.out.println("No!");
	}
	
	public static boolean isPalindrome(String str) {
		// Pointers pointing to the beginning 
        // and the end of the string 
        int start = 0, end = str.length() - 1;
        
        // While there are characters toc compare 
        while (start < end) { 
            // If there is a mismatch 
            if (str.charAt(start) != str.charAt(end)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            start++; 
            end--; 
        } 
  
        // Given string is a palindrome 
        return true; 
	}
}
