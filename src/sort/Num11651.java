package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Num11651 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		
		int[][] a = new int[n][2];
		String[] s = new String[2];
		
		for(int i=0; i<n; i++) {
			s = br.readLine().split(" ");
			a[i][0] = Integer.parseInt(s[0]);
			a[i][1] = Integer.parseInt(s[1]);
		}
		
		Arrays.sort(a, new Comparator<int[]>() {
			public int compare(int[] x, int[] y) {
				if(x[1] == y[1])
					return Integer.compare(x[0], y[0]);
				else
					return Integer.compare(x[1], y[1]);
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i][0] + " " + a[i][1]);
		}
	}
}
