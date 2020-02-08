package etc;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Num10845 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Deque<Integer> queue = new LinkedList<Integer>();
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			String input = s.next();
			if(input.contains("push")) {
				int num = s.nextInt();
				queue.add(num);
			}
			else if(input.equals("pop")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.poll());
				}
			}
			else if(input.equals("size")) {
				System.out.println(queue.size());
			}
			else if(input.equals("empty")) {
				if(queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
			else if(input.equals("front")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peekFirst());
				}
			}
			else if(input.equals("back")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peekLast());
				}
			}
		}

	}

}
