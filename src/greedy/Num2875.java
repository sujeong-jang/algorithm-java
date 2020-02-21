package greedy;

import java.util.Scanner;

/*
 * 대회 or 인턴
 * 백준대학교에서는 대회에 나갈 때 2명의 여학생과 1명의 남학생이 팀을 결성해서 나가는 것이 원칙이다.
 * 백준대학교는 뛰어난 인재들이 많아 올해에도 N명의 여학생과 M명의 남학생이 팀원을 찾고 있다.
 * 그런데 올해에는 대회에 참여하려는 학생들 중 K명을 반드시 인턴쉽 프로그램에 참여하라는 학교의 방침이 생기게 되었다. 
 * 인턴쉽에 참여하는 학생은 대회에 참여하지 못한다.
 * 백준대학교에서는 뛰어난 인재들이 많기 때문에, 많은 팀을 만드는 것이 최선이다.
 * 여러분은 N명의 여학생과 M명의 남학생, K명의 인턴쉽에 참여해야하는 인원이 주어질 때 만들 수 있는 최대의 팀 수를 구하면 된다.
 */

public class Num2875 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		
		int count = 0;

		while(true) {
			if(n >=2 && m >= 1 && n+m >= k+3) {
				n -= 2;
				m--;
				count++;
			}else {
				break;
			}		
		}
		System.out.println(count);
	}

}
