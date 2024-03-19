package javaprep;

public class exception {
	public static void main(String[] args) {
int a = 10, c;
try { 
	 c = a/0;
	System.out.println("Result: " + c);

}
catch(Exception ae) {
	System.out.println("it is divisible by zero error, change denominant part");
}
	System.out.println("Program Completed");
}
}