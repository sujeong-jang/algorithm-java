package dp;

import java.util.Scanner;

/*
 * 쉬운 계산 수
 * 인접한 자리의 차이가 1이 나는 수를 계단 수라고 한다
 * 예:45656
 * 길이가 N인 계단 수의 개수를 구하는 문제 
 */
public class Num10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long mod = 1000000000L;
		long sum = 0;
		long[][] d = new long[100][100];
		
		//d[i][j] : i길이의 마지막 수가 j인 숫자들의 개수
		//길이가 1인 계단수일 때, 1-9까지 1개씩 존재하므로 1로 초기화한다.
		for(int i=1; i<=9; i++) {
			d[1][i] = 1;
		}
		
		//길이가 2이상인 계단수
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				d[i][j] = 0;
				if(j-1 >= 0) d[i][j] += d[i-1][j-1];
				if(j-1 <= 9) d[i][j] += d[i-1][j+1];
				d[i][j] %= mod;
			}
		}
		
		for(int i=0; i<=9; i++) {
			sum += d[n][i];
		}
		sum %= mod;
		System.out.println(sum);
	}
}
