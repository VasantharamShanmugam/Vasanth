package week1.day2;

import java.util.Arrays;

public class ArraysLearn {

	public static void main(String[] args) {
		/*
		 * int[] values=new int[3]; values[0]=50; values[1]=20; values[2]=10;
		 */
	//String[] name = new String[3];
//System.out.println(values[2]);
//System.out.println(values.length);
	
	/*
	 * for(int i=0;i<values.length;i++) 
	 * { System.out.println(values[i]); }
	 */
		
	/*
	 * int[] values = {50,20,60,40}; 
	 * Arrays.sort(values); 
	 * for(int eachValue:values)
	 * { System.out.println(eachValue); }
	 */

	//for(int	i=values.length-1;i>=0;i--) {
	//	System.out.println(values[i]);
	//

int[][]values = new int[3][2];
values[0][0] = 10;
values[0][1] = 20;
values[1][0] = 30;
values[1][1] = 40;
values[2][0] = 50;
values[2][1] = 60;

for(int i=0;i<values.length;i++) {
	{
		for(int j=0;j<values[i].length;j++) {
			System.out.println(values[i][j]);
		}
	}
}
	}	

}
