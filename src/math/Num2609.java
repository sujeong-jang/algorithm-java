package math;

import java.util.Scanner;

/*
 * 최대공약수와 최소공배수
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * 
 */
public class Num2609 {
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		else
			return gcd(b, a%b);
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(gcd(a, b) + "\n" + a*b/gcd(a, b));
	}
}
