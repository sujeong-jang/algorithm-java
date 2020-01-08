package dp;

import java.util.Scanner;

public class Num11726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[1000];
		d[1] = 1; // 공집합 1개
		d[2] = 2;
		for(int i=3; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}
}
