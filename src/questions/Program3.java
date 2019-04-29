package questions;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int sumHigher = 0;
		int minLength = 0;

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

		try {
			for (int c = 0; c < x; c++) {
				if (vect[c] > v) {
					System.out.println("Minimum length subarray: 1");
				} else {
					sum += vect[c];
					if (sum > v) {
						for (int f = c; f < x; f++) {
							if (vect[f] > v) {
								System.out.println("Minimum length subarray: 1");
								c = x;
							}
						}

						for (int e = c; e >= 0; e--) {
							if (sum - vect[e] > v) {
								sum -= vect[e];
								c -= 1;
							}
						}
						
						for(int g = x - 1; g >= 0; g--) {
							if(vect[g] > v) {
								sumHigher = vect[g];
								int k = 1;
							}
						}
						
						System.out.println("Minimum length subarray: " + (c + 1));
						break;
					} else if (c == x - 1 && sum <= v) {
						System.out.println("Not possible");
					}
				}
			}
		} catch (RuntimeException e) {
			System.out.println();
		}
		sc.close();
	}

}
