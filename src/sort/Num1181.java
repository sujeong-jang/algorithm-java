package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Num1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 문자열 정수로 변환
		int n = Integer.parseInt(br.readLine());

		// 중복 제거
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		// list로 변환
		ArrayList<String> list = new ArrayList<>(set);

		// 길이순으로 정렬 후 길이가 같을 경우 사전순으로 정렬
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return o1.length() - o2.length();
			}
		});
		
		for(String s: list) {
			System.out.println(s);
		}
	}
}
