package greedy;

import java.util.Scanner;

/*
 * 거스름돈
 * 타로는 자주 JOI잡화점에서 물건을 산다. 
 * JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 
 * 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 
 * 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 
 * 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
 */
public class Num5585 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] coin = {500,100,50,10,5,1};
		int t = s.nextInt();
		int money = 1000-t;
		int count = 0;
		
		for(int i=0; i<coin.length; i++) {
			count += money / coin[i];
			money %= coin[i];
		}
		
		System.out.println(count);
	}

}
