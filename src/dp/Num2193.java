package dp;

import java.util.Scanner;

/*
 * 이친수
 * 0과 1로만 이루어진 수를 이진수라 한다. 
 * 이러한 이진수 중 특별한 성질을 갖는 것들이 있는데,
 * 이들을 이친수(pinary number)라 한다. 이친수는 다음의 성질을 만족한다.
 * 1) 이친수는 0으로 시작하지 않는다.
 * 2) 이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
 * 
 * N(1 ≤ N ≤ 90)이 주어졌을 때, N자리 이친수의 개수를 구하는 프로그램을 작성하시오.
 */
public class Num2193 {
	public static void count(int n) {
		long[] d = new long[n+1];
		
		d[0] = 0;
		d[1] = 1;
		
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		System.out.println(d[n]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		count(n);
	}
}
