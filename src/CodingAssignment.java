
public class CodingAssignment {

	public static void main(String[] args) {
		
//		// step 1.
//		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//		
//		// a.
//		System.out.println( ages[ages.length - 1] - ages[0] ); // subtracted first element from last element
//		
//		// b.
//		int[] agesNew = new int[ages.length + 1];
//		for (int i = 0; i < ages.length; i++) {
//			agesNew[i] = ages[i];
//		}
//		
//		agesNew[agesNew.length - 1] = 22; // added new age to array
//		
//		for (int age : agesNew) {
//			System.out.print(age + " ");
//		}
//		System.out.println();
//		System.out.println( agesNew[agesNew.length - 1] - agesNew[0] ); // repeating step a.
//		
//		// c.
//		int sumAgesNew = 0;
//		
//		for (int i = 0; i < agesNew.length; i++) {
//			sumAgesNew += agesNew[i];
//		}
//		System.out.println( (double) sumAgesNew / agesNew.length); // prints average of ages in array
		
		
//		// step 2.
//		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		
//		// a.
//		int sumLetters = 0;
//		
//		for (int i = 0; i < names.length; i++) {
//			sumLetters += names[i].length();
//		}
//		
//		System.out.println((double) sumLetters / names.length); // prints average amount of letters per name
//		
//		// b.
//		String namesConcatenated = "";
//		
//		for (String name : names) {
//			namesConcatenated += name + " ";
//		}
//		
//		System.out.println(namesConcatenated); // prints all names concatenated together, separated by spaces
		
		
//		// step 3.
//		int[] exampleArr = {1, 2, 3, 4, 5};
//		System.out.println( exampleArr[exampleArr.length - 1] ); // accessing the last element in an array
//		
//		// step 4.
//		System.out.println( exampleArr[0] ); // accessing the first element in an array
		
		
//		// step 5.
//		int[] nameLengths = new int[names.length];
//		
//		for (int i = 0; i < nameLengths.length; i++) {
//			nameLengths[i] = names[i].length();  // resulting array nameLengths = [3,5,3,5,4,3]
//		}
//		
//		// step 6.
//		int totalLetters = 0;
//		
//		for (int i = 0; i < nameLengths.length; i++) {
//			totalLetters += nameLengths[i];
//		}
//		
//		System.out.println(totalLetters); // prints sum of all elements in array nameLengths
		
//		// step 7.
//		System.out.println(repeatString("Hello", 3) );
		
		
//		// step 8.
//		String firstName = "Johnny";
//		String lastName = "Lee";
//		
//		System.out.println(fullName(firstName, lastName) );
		
//		// step 9.
//		int[] integers = {10, 20, 30, 40, 50, 60};
//		System.out.println(sumLarger100(integers) );
		
//		// step 10.
//		double[] doubArr = {1.5, 2.3, 1.2, 1.9, 2.2, 2.3};
//		System.out.println(averageArr(doubArr) );
		
		// step 11.
		double[] arr1 = {1.5, 2.3, 1.2, 1.9, 2.2, 2.3};
		double[] arr2 = {4.7, 5.2, 4.9, 5.0, 4.4, 4.6};
		
		System.out.println(averageLarger(arr1, arr2));
	}
	
	static boolean averageLarger(double[] arr1, double[] arr2) {
		return averageArr(arr1) > averageArr(arr2);  //returns true if average of arr1 is greater than average of arr2
	}
	
	static double averageArr(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
	static boolean sumLarger100(int[] arr) {
		int sum = 0;
		for (int integers : arr) {
			sum += integers;
		}
		return sum > 100;
	}
	
	static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	static String repeatString(String str, int x) {
		String newStr = "";
		for (int i = 1; i <= x; i++) {
			newStr += str;
		}
		return newStr;
	}

}
