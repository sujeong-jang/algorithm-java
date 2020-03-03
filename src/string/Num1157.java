package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 단어 공부
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 * [입력]
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * [출력]
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */

public class Num1157 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		int len = input.length();
		int max = Integer.MIN_VALUE;
		int[] a = new int[26]; //알파벳 개수 = 26

		for(int i=0; i<len; i++) {
			int alpha = input.charAt(i) - 65; //index 0부터 시작하기 위해
			a[alpha]++;
		}
		
		char result = '?';

		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
				result = (char)(i+65);
			} else if(max == a[i]) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
