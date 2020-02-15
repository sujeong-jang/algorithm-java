package etc;

import java.util.Scanner;

/*
 * N! mod P(1)
 * 양의 정수 N과, N보다 큰 소수 P가 주어질 때, N!을 P로 나눈 나머지를 구하여라.
 */

public class Num17466 {
	public static long fec(long n, long p) {
		long result = 1;
		
		for(long i=1; i<=n; i++) {
			result *= i;
			result %= p;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long p = s.nextLong();
		
		long result = fec(n, p);
		
		System.out.println(result);
	}
}
