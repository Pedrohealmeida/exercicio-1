package questions;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Vect length: ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		int[] ord = new int[n];
		int[] atrib = new int[n];
		int[] sum = new int[n];

		System.out.print("Vect values: ");

		for (int x = 0; x < n; x++) {
			vect[x] = sc.nextInt();
			atrib[x] = vect[x];
		}

		Ordernar.ord(n, vect);
		int a = 0;

		for (int y = 0; y < n; y++) {
			for (int z = 0; z < n; z++) {
				if (y == 0 && vect[y] == vect[z]) {
					sum[y] += 1;
				} else if (vect[y] == vect[z] && vect[y] != vect[y - 1]) {
					sum[y] += 1;
				}

			}
		}
		Ordernar.ordDecres(n, sum, vect);	

		for (int c : vect) {
			System.out.print(c + " ");
		}
	}
}
