package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * 30
 * 어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 
 * 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
 * 미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.
 */
public class Num10610 {

	public static void go(String[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += Integer.parseInt(num[i]);
		}
		if (sum % 3 == 0) {
			Arrays.sort(num, Collections.reverseOrder());
			for (String s : num)
				System.out.print(s);
		} else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();

		String[] num = input.split("");

		if (input.contains("0"))
			go(num);
		else
			System.out.println(-1);
	}
}
