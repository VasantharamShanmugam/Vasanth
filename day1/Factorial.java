package week1.day1;

public class Factorial {
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) How to declare variables
	 * 2) How to use operators
	 * 3) How to iterate values using for loop
	 * 
	 */	

	public static void main(String[] args) {
		int i = 5;
		int fact = 1;
		for(int j=1;j<=i;j++) {
			fact = fact*j;
		}
		System.out.println("Factorial of 5 is "+fact);
	}

}
