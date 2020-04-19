package tucker19GenericsAndMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ListAdderMethod {

	public static double listAdder(ArrayList<? extends Number> list) {
		double total = 0;
		
		//loop through each list item 
		for (int i = 0; i<list.size(); i++) {
			total = total + list.get(i).doubleValue();
			
		}
	
		System.out.println(list + " ");
		return total;
		
	}
	
	public static void main(String[] args) {
		//make ArrayLists of different types
		ArrayList<Integer> holdInts = new ArrayList<Integer>(
				Arrays.asList(new Integer[] {12, 21, 7, 16, 8, 13}));
		
		ArrayList<Double> holdDouble = new ArrayList<Double>(
				Arrays.asList(new Double[] {1.1, 2.2, 3.3, 4.4, 5.5, 6.6}));
		
		ArrayList<Byte> holdByte = new ArrayList<Byte>(
				Arrays.asList(new Byte[] {12, 20, 4, 7}));
		
		//declare double value that will hold total of combined list items in holdInts
		double total = listAdder(holdInts);
		System.out.println("Integer list totals: " + total);
		System.out.println();
		//re initialize total to hold list items in holdDouble
		total = listAdder(holdDouble);
		System.out.println("Double list totals: " + total);
		System.out.println();
		//re initialize total to hold list items in holdByte
		total = listAdder(holdByte);
		System.out.println("Byte list totals: " + total);
		
	}

}
