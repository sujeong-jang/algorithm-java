package greedy;

import java.util.Scanner;

/*
 * 동전 0
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 
 * 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 */
public class Num11047 {

	public static void coin_count(int[] a, int price) {
		int count = 0;
		int p = price;
		
		for(int i=a.length-1; i>=0; i--) {
			count += p / a[i];
			p %= a[i];
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int price = s.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		coin_count(a, price);
	}
}
