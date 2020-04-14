package tucker19GenericsAndMethods;

public class ArrayOfElements {

	public static < E > void arrayOfElements(E[] numElements) {
		//display array using generic method
		for(E showElement : numElements) {
			System.out.printf("%s ", showElement);
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		//create arrays of integer, string, double
		Integer[] intElements = { 12, 21, 7, 16, 8, 13 };
		String[] stringElements = { "one", "two", "three", "four" };
		Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		//create counter for the loop
		int count = 0;
		//loop to count int elements
		for(; count < intElements.length; count++) {
		}
		System.out.println("Here is an Integer Array");
		arrayOfElements(intElements);
		System.out.println("That array held " + count + " elements");
		System.out.println();
		
		//reset counter
		count = 0;
		//loop to count string elements
		for(; count < stringElements.length; count++) {
		}
		System.out.println("Here is a String Array");
		arrayOfElements(stringElements);
		System.out.println("That array held " + count + " elements");
		System.out.println();
		
		//reset counter
		count = 0;
		//loop to count double elements
		for(; count < doubleElements.length; count++) {
		}
		System.out.println("Here is a Double Array");
		arrayOfElements(doubleElements);
		System.out.println("That array held " + count + " elements");
	}

}
