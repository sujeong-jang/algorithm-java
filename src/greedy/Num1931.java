package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 회의실 배정
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의들에 대하여 회의실 사용표를 만들려고 한다. 
 * 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라. 
 * 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 
 * 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 
 * 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
 */
public class Num1931 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] a = new int[n][2];

		for (int i = 0; i < n; i++) {
			a[i][0] = s.nextInt();
			a[i][1] = s.nextInt();
		}

		Arrays.sort(a, new Comparator<int[]>() {
			public int compare(int[] start, int[] end) {
				if (start[1] == end[1]) {
					return Integer.compare(start[0], end[0]); // 끝나는 시간이 같을 경우 시간시간을 기준으로 오름차순
				}
				return Integer.compare(start[1], end[1]); // 끝나는 시간을 기준으로 오름차순
			}
		});

		int end = -1;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a[i][0] >= end) {
				end = a[i][1];
				count++;
			}
		}

		System.out.println(count);

	}

}
