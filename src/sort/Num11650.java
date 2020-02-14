package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Num11650 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		int[][] a = new int[n][2];
		String[] str = new String[2];
		
		for(int i=0; i<n; i++) {
			str = br.readLine().split(" ");
			a[i][0] = Integer.parseInt(str[0]);
			a[i][1] = Integer.parseInt(str[1]);
		}
		
		Arrays.sort(a, new Comparator<int[]>() {
			public int compare(int[] x, int[] y) {
				if(x[0] == y[0]) {
					return Integer.compare(x[1], y[1]);
				}
				return Integer.compare(x[0], y[0]); 
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i][0] + " " + a[i][1]);
		}

	}

}
