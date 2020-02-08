package search;

import java.util.Arrays;
import java.util.Scanner;

public class Num1920 {
	
	public static int binary_search(int[] a, int n) {
		int mid;
		int low = 0;
		int high = a.length-1;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if(a[mid] == n)
				return 1;
			else if(a[mid] < n)
				low = mid+1;
			else
				high = mid-1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int[] a1 = new int[n1];
		for(int i=0; i<n1; i++) {
			a1[i] = s.nextInt();
		}
		
		int n2 = s.nextInt();
		int[] a2 = new int[n2];
		for(int i=0; i<n2; i++) {
			a2[i] = s.nextInt();
		}
		
		Arrays.sort(a1);
		
		for(int i=0; i<n2; i++) {
			System.out.println(binary_search(a1, a2[i]));
		}
	}
}
