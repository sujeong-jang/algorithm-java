package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Num2750 {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] a = new int[n];
			
			for(int i=0; i<n; i++) {
				a[i] = s.nextInt();
			}
			
			Arrays.sort(a);
			
			for(int a1: a) {
				System.out.println(a1);
			}

		}

	}


