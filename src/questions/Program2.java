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
		
		System.out.println("Vect values: ");
		
		for(int a = 0; a < x; a++) {
			vect[a] = sc.nextInt();
		}
		
		Ordernar.ord(x, vect);
		
		int min = 1;
		
		for(int y = 0; y != x &&  min >= vect[y]; y++) {
			min += vect[y];
		}
		
		System.out.println(min);
		
		sc.close();
	}
}
