package brute_force;

import java.util.Scanner;

/*
 * 퇴사
 * 상담원으로 일하고 있는 백준이는 퇴사를 하려고 한다.
 * 오늘부터 N+1일째 되는 날 퇴사를 하기 위해서, 남은 N일 동안 최대한 많은 상담을 하려고 한다.
 * 백준이는 비서에게 최대한 많은 상담을 잡으라고 부탁을 했고, 비서는 하루에 하나씩 서로 다른 사람의 상담을 잡아놓았다.
 * 각각의 상담은 상담을 완료하는데 걸리는 기간 Ti와 상담을 했을 때 받을 수 있는 금액 Pi로 이루어져 있다.
 * 상담을 적절히 했을 때, 백준이가 얻을 수 있는 최대 수익을 구하는 프로그램을 작성하시오.
 */
public class Num14501 {
	static int[] t;
	static int[] p;
	static int n;
	static int max = 0;
	
	public static void go(int day, int money) {
		
		if(day >= n) {
			max = Math.max(max, money);
			return;
		}
		if(day+t[day] <= n)
			go(day+t[day], money+p[day]);
		
		go(day+1, money);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		t = new int[n];
		p = new int[n];
		
		for(int i=0; i<n; i++) {
			t[i] = s.nextInt();
			p[i] = s.nextInt();
		}
		
		go(0, 0);
		System.out.println(max);
	}

}
