package questions;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int sumHigher = 0;
		
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

		System.out.print("Value: ");
		int v = sc.nextInt();
		int k = 0;

		for (int g = x - 1; g >= 0; g--) {
			if (vect[g] > v) {
				sumHigher = vect[g];
				k = 1;

			} else if (sumHigher == 0 && g == 0) {
				sumHigher = vect[x - 1];
				k = 1;
			}
			if (sumHigher < v) {
				if (g == 0) {
					if (sumHigher <= v) {
						for (int f = 0; f < x && f != x - 1; f++) {
							if (f == x - 2 || sumHigher + vect[f] > v) {
								sumHigher += vect[f];
								k += 1;
								if (sumHigher > v) {
									break;
								}
							}
							if (f == x - 2) {
								for (int h = x - 3; h >= 0; h--) {
									sumHigher += vect[h];
									k += 1;
									if (sumHigher > v) {
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		if (k > x || sumHigher <= v) {
			System.out.println("Not possible");
		} else {
			System.out.println("Minimum vect length size: " + k);
		}
		sc.close();

	}
}
