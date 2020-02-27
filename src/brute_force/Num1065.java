package brute_force;

import java.util.Scanner;

/*
 * 한수
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */
public class Num1065 {

	public static int go(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int a;
			int b;
			int c;

			if (i < 100) // 10의 자리수
				count++;
			else if (i < 1000) { // 100의 자리수
				c = i / 100;
				b = (i % 100) / 10;
				a = i % 10;
				
				if (2 * b == a + c)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(go(n));
	}
}
