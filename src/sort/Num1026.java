package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num1026 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		Integer[] b = new Integer[n];
		
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			b[i] = s.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += a[i] * b[i];
		}
		
		System.out.println(sum);
		
	}

}
