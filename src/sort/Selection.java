package sort;

import java.util.Scanner;
/*
 * 기준이 되는 수와 나머지 수를 비교하여 가장 작은 수를 제일 앞으로 보냄
 */
public class Selection {
	
	public static void selection(int[] a) {
		int tmp;
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}	
			}
		}
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		selection(a);

	}

}
