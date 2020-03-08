package brute_force;

import java.util.Scanner;

/*
 * 부분수열의 합
 * N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.
 */

public class Num1182 {
	static int[] a;
	static int goal;
	static int count = 0;
	
	public static void go(int i, int sum) {
		if(i == a.length) {
			if(sum == goal)
				count++;
			return;
		}
		
		go(i+1, sum);
		go(i+1, sum + a[i]);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		goal = s.nextInt();
		a = new int[n];
		
		for(int i=0; i <n; i++)
			a[i] = s.nextInt();
		
		go(0, 0);
		
		// 구하려는 합이 0인 경우 공집합을 빼준다
		if(goal == 0)
			count--;
		
		System.out.println(count);
	}
}
