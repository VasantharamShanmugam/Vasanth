package week1.day1;

public class OddNumbers {
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 * 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1)How to initialize and declare variables
	 * 2)How to iterate values using for loop
	 * 3)How to compare values using if loop
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Printing only the Odd Numbers from 1 to 20");
		for(int i=1;i<=20;i++){
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}

	}

}
