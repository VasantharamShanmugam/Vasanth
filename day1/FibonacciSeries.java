package week1.day1;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)Declare and initialize variables
	 * 2)Iterate values and compare
	 * 3) Logic to print values according to the condition
	 * 
	 */

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		for(int i=1;i<=range;i++){
			System.out.println(firstNum);
			int sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;		
		}
		
	}

}
