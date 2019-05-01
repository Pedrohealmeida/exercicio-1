package questions;

public class Ordernar {

	public static void ord(int x, int[] vect) {
		for (int a = 0; a < x; a++) {
			for (int b = 0; b < x; b++) {
				if (b + 1 != x && vect[b] > vect[b + 1]) {
					int aux = vect[b];
					vect[b] = vect[b + 1];
					vect[b + 1] = aux;
				}
			}
		}
	}
	
	public static void ordDecres(int x, int[] sum, int[] vect) {
		int c = 0;
		int d = 0;
		for (int a = 0; a < x; a++) {
			for (int b = 0; b < x; b++) {
				if (sum[a] != 0 && sum[b] != 0 && sum[a] < sum[b] && a < b) { 
					c = a;
					d = b + sum[b] - 1;
					
					while(c != d && c < d) {
						int aux = vect[c];
						vect[c] = vect[d];
						vect[d] = aux;
						c++;
						d--;
					}
					
					int aux = sum[a];
					sum[a] = sum[b];
					sum[b] = aux;
				}
			}
		}
	}

}
