package dp;

import java.util.Scanner;

/*
 * 계단 오르기
 * 계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임이다.
 * 각각의 계단에는 일정한 점수가 쓰여 있는데 계단을 밟으면 그 계단에 쓰여 있는 점수를 얻게 된다.
 * 계단 오르는 데는 다음과 같은 규칙이 있다.
 * 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 
 * 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
 * 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
 * 마지막 도착 계단은 반드시 밟아야 한다.
 */

public class Num2579 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n+1];
		int[] d = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			a[i] = s.nextInt();
		}
		
		d[1] = a[1];
		d[2] = a[2] + d[1];
		
		for(int i=3; i<=n; i++)
			d[i] = Math.max(d[i-2]+a[i], d[i-3]+a[i]+a[i-1]);
		
		System.out.println(d[n]);
	}
}
