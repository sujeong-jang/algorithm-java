package math;

import java.util.Scanner;

/*
 * 정수 제곱근
 * 정수가 주어지면, 그 수의 정수 제곱근을 구하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 정수 n이 주어진다. (0 ≤ n < 263)
 * 
 * [출력]
 * 첫째 줄에 q2 ≥ n인 가장 작은 음이 아닌 정수 q를 출력한다.
 * 
 */

public class Num2417 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long result = (long) Math.sqrt(n);
		
		if((long)Math.pow(result, 2) < n) {
			System.out.println(result+1);
		}else {
			System.out.println(result);
		}
	}
}
