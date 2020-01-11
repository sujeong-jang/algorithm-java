package dp;

import java.util.Scanner;

/*
 * 1,2,3 더하기
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class Num9095 {
	public static int add123(int n) {
		int[] d = new int[100];
		int sum = 0;
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		for(int i=3; i<=n; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3]; //점화식
		}
		return d[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(add123(n));
	}

}
