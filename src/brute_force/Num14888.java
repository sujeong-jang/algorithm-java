package brute_force;

import java.util.Scanner;

/*
 * 연산자 끼워넣기
 * N개의 수로 이루어진 수열 A1, A2, ..., AN이 주어진다. 
 * 또, 수와 수 사이에 끼워넣을 수 있는 N-1개의 연산자가 주어진다. 
 * 연산자는 덧셈(+), 뺄셈(-), 곱셈(×), 나눗셈(÷)으로만 이루어져 있다.
 * 우리는 수와 수 사이에 연산자를 하나씩 넣어서, 수식을 하나 만들 수 있다. 이때, 주어진 수의 순서를 바꾸면 안 된다.
 * 예를 들어, 6개의 수로 이루어진 수열이 1, 2, 3, 4, 5, 6이고, 주어진 연산자가 덧셈(+) 2개, 뺄셈(-) 1개, 곱셈(×) 1개, 나눗셈(÷) 1개인 경우에는 총 60가지의 식을 만들 수 있다. 
 * 예를 들어, 아래와 같은 식을 만들 수 있다.
 * 1+2+3-4×5÷6
 * 1÷2+3+4-5×6
 * 1+2÷3×4-5+6
 * 1÷2×3-4+5+6
 */
public class Num14888 {
	static int n;
	static int[] op;
	static int[] a;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void dfs(int result, int index) {
		if(index > n-1) {
			max = Math.max(result, max);
			min = Math.max(result, min);
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(op[i] > 0) {
				op[i]--;
				switch(i){
				case 0:
					dfs(result + a[i], index+1);
					break;
				case 1:
					dfs(result - a[i], index+1);
					break;
				case 2:
					dfs(result * a[i], index+1);
					break;
				case 3:
					dfs(result / a[i], index+1);
					break;
				}
				op[i]++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		a = new int[n];
		op = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = s.nextInt();

		for(int i=0; i<4; i++)
			op[i] = s.nextInt();
		
		dfs(a[0], 1);
		System.out.println(max);
		System.out.println(min);
	}
}
