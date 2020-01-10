package dp;

import java.util.Scanner;
/*
 * 2xn 타일링2
 * 2×n 크기의 직사각형을 1×2, 2×1, 2x2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class Num11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[1001];
		
		d[0] = 1;
		d[1] = 1;
		for(int i=2; i<=n; i++) {
			d[i] = 2*d[i-2] + d[i-1];
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}
}
