package simpleproblems;

public class Testy3 {
	    public static void main(String[] args) {
	        String str = "Hello java";
	        
	        // Method to count characters
	        int totalCharacters = countCharacters(str);
	        
	        System.out.println("Total number of characters in the string: " + totalCharacters);
	    }
	    
	    public static int countCharacters(String str) {
	        // Remove this line if you want to include spaces in the count
	        // str = str.replace(" ", ""); 

	        return str.length();
	    }
	}


