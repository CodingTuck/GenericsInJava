package tucker19GenericsAndMethods;

import java.util.Random;

public class MaxElementArray {

	public static <E extends Comparable<E>> E max(E[] list) {
		
		E max = list[0];
		
		for(E maxElement : list) {
			if (maxElement.compareTo(max) > 0) {
				max = maxElement;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		//declare integer array to hold 10 random integers
		Integer maxNum[] = new Integer[10];
		//declare random variable
		Random randNum = new Random();
		//loops through random set of 10 numbers and lists them in a line
		for (int i = 0; i < maxNum.length; i++) {
			maxNum[i] = randNum.nextInt(100);
			System.out.print(maxNum[i] + " ");
		}
		
		System.out.println();
		//invokes the method and prints out the max number in the array
		System.out.println("The max number in the array is " + max(maxNum));
	}
}
	

