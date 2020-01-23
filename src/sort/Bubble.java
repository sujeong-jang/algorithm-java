package sort;

import java.util.Scanner;
/*
 * 인접한 두개의 원소를 비교하여 가장 큰 원소가 마지
 */
public class Bubble {
	
	public static void bubble(int[] a) {
		int tmp;
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		bubble(a);
	}

}
