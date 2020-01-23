package sort;

import java.util.Scanner;
/*
 * 각 숫자를 적절한 위치에 삽입하는 방법
 * 다른 정렬(선택, 버블)방식들과 다르게 '필요할 때만' 위치를 바꾼다
 */
public class Insertion {
	public static void insert(int[] a) {
		
		for(int i=1; i<a.length-1; i++) {
			
		}
		
		for(int n=0; n<a.length; n++) {
			System.out.print(a[n] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		insert(a);

	}

}
