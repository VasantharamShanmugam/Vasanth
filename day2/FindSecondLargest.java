package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for(int temp:data)
		System.out.println(temp);
		System.out.println("The Second Largest from the above array is "+data[4]);
	}

}
