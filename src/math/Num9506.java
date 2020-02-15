package math;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 약수들의 합
 *  어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
 *  예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
 *  n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
 *  
 *  [입력]
 *  입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100, 000)
 *  입력의 마지막엔 -1이 주어진다.
 *  
 *  [출력]
 *  테스트케이스 마다 한줄에 하나씩 출력해야 한다.
 *  n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
 *  이때, 약수들은 오름차순으로 나열해야 한다.
 *  n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
 */
public class Num9506 {
	public static void divisor(int n) {
		int[] a = new int[n];
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=1; i<n; i++) {
			if(n % i == 0) {
				a[i] = 1;
			}
		}
		
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(a[i] == 1) {
				sum += i;
				list.add(Integer.toString(i));
			}
		}
		
		if(sum == n){
			System.out.println(n + " = " + String.join(" + ", list));
		}else {
			System.out.println(n +" is NOT perfect.");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int input = s.nextInt();
			if(input == -1)
				break;
			else
				divisor(input);
		}
	}
}
