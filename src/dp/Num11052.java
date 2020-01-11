package dp;

import java.util.Scanner;

/*
 * 카드 구매하기
 * 카드는 카드팩의 형태로만 구매할 수 있고,
 * 카드팩의 종류는 카드 1개가 포함된 카드팩, 카드 2개가 포함된 카드팩, ... 카드 N개가 포함된 카드팩과 같이 총 N가지가 존재한다.
 * 카드 팩의 가격이 주어졌을 때, N개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최댓값을 구하는 프로그램을 작성하시오.
 */
public class Num11052 {
	public static void maxPrice(int n, int[] p) {
		int[] d = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				d[i] = Math.max(d[i], d[i-j]+p[j]);
			}
		}
		System.out.println(d[n]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n+1];
		for(int i=1; i<=n; i++) {
			p[i] = sc.nextInt();
		}
		maxPrice(n, p);
	}
}
