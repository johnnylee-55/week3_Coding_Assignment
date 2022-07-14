
public class CodingAssignment {

	public static void main(String[] args) {
		
		// step 1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// a.
		System.out.println( ages[ages.length - 1] - ages[0] ); // subtracted first element from last element
		
		// b.
		int[] agesNew = new int[ages.length + 1];
		for (int i = 0; i < ages.length; i++) {
			agesNew[i] = ages[i];
		}
		
		agesNew[agesNew.length - 1] = 22; // added new age to array
		
		for (int age : agesNew) {
			System.out.print(age + " ");
		}
		System.out.println();
		System.out.println( agesNew[agesNew.length - 1] - agesNew[0] ); // repeating step a.
		
		// c.
		int sumAgesNew = 0;
		
		for (int i = 0; i < agesNew.length; i++) {
			sumAgesNew += agesNew[i];
		}
		System.out.println( (double) sumAgesNew / agesNew.length); // prints average of ages in array
		
		
		// step 2.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sumLetters = 0;
		
		for (int i = 0; i < names.length; i++) {
			sumLetters += names[i].length();
		}
		
		System.out.println((double) sumLetters / names.length); // prints average amount of letters per name

	}

}
