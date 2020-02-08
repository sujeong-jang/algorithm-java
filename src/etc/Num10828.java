package etc;

import java.util.Scanner;
import java.util.Stack;

public class Num10828 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<n; i++) {
			String input = s.next();
			if(input.contains("push")) {
				int num = s.nextInt();
				stack.push(num);
				System.out.println(stack.peek());
			}
			else if(input.equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.pop());
				}
			}
			else if(input.equals("size")) {
				System.out.println(stack.size());
			}
			else if(input.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(1);
				}
			}
			else if(input.equals("top")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				}
			}
		}

	}

}
