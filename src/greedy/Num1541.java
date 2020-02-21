package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num1541 {
	
	public static int splitInput(String a) {
		String[] b = a.split("\\+");
		int sum = 0;
		
		for(String s: b)
			sum += Integer.parseInt(s);
		
		return sum;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int result = 0;
		
		/*
		 * -를 기준으로 분리
		 * ex) 3+4-4+5-2-1+2 -> 3-(4+5)-2-(1+2)
		 * 첫번째는 숫자이기 때문에 첫번째를 제외한 나머지 숫자를 빼주면 된다
		 */
		String[] a = input.split("\\-");
		
		result += splitInput(a[0]);
		
		for(int i=1; i<a.length; i++) {
			result -= splitInput(a[i]);
		}
		System.out.println(result);
	}

}
