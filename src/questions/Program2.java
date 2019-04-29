package questions;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Vect length: ");
		int x = sc.nextInt();
		int[] vect = new int[x];

		System.out.println("Vect numbers: ");
		for (int y = 0; y < x; y++) {
			vect[y] = sc.nextInt();
		}

		for (int a = 0; a < x; a++) {
			for (int b = 0; b < x; b++) {
				if (b + 1 != x && vect[b] > vect[b + 1]) {
					int aux = vect[b];
					vect[b] = vect[b + 1];
					vect[b + 1] = aux;
				}
			}
		}

		int smNumber = 1;
		for (int z = 0; z < x && vect[z] <= smNumber; z++) {
			smNumber += vect[z];
		}

		System.out.println(smNumber);

	}
}
