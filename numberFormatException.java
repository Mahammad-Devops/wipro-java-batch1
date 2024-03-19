package javaprep;

public class numberFormatException {
	
	    public static void main(String[] args) {
	        String str1 = "123";      
	        String str2 = "abc";      
	        String str3 = "12.34";    

	        try {
	            int num1 = Integer.parseInt(str1);
	            System.out.println("Parsed Integer 1: " + num1);

	            int num2 = Integer.parseInt(str2);  
	            System.out.println("Parsed Integer 2: " + num2);

	            int num3 = Integer.parseInt(str3);  
	            System.out.println("Parsed Integer 3: " + num3);
	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException caught: " + e.getMessage());
	        }
	    }
	}


