package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Num10867 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			set.add(s.nextInt());
		}
		
		List<Integer> list = new ArrayList<>(set);

		Collections.sort(list);
		
		for(int i: list) {
			System.out.print(i + " ");
		}
	}

}
