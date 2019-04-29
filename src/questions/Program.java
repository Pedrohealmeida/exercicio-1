package questions;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 1;
		int j = 0;

		System.out.print("Enter a string: ");
		String stringTest = sc.nextLine();

		String[] vect = new String[stringTest.length()];
		Character[] vectChar = new Character[stringTest.length()];

		for (int y = 0; y < stringTest.length(); y++) {
			vect[y] = stringTest.substring(y, y + 1);
			vectChar[y] = vect[y].charAt(0);
		}

		for (int z = 0; z < stringTest.length(); z++) {
			if(j == 0 && z + 1 != stringTest.length() && vectChar[0] == vectChar[z+1]) {
				z = 0;
				j += 1;
			}
			if (j != 0 && x < stringTest.length() && vectChar[x] == vectChar[z] && x != z) {
					x++;
					z = -1;
			}
		}

		System.out.printf("First non-repeating character in %s: %c%n", stringTest, vectChar[x]);


		sc.close();
	}
}
