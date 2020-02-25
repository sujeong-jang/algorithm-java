package bfs_dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 단지번호 붙이기
 * <그림 1>과 같이 정사각형 모양의 지도가 있다. 
 * 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 
 * 철수는 이 지도를 가지고 연결된 집들의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다. 
 * 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 
 * 대각선상에 집이 있는 경우는 연결된 것이 아니다. 
 * <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 
 * 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
 */
public class Num2667 {
	static final int[] dx = { 0, -1, 0, 1 };
	static final int[] dy = { -1, 0, 1, 0 };
	
	static int count;
	static int[][] a;
	static int n;
	
	public static void dfs(int x, int y) {
		a[x][y] = 0;
		count++;
		
		for(int i=0; i<4; i++) {
			int _x = x + dx[i];
			int _y = y + dy[i];
			
			if(_x >= 0 && _y >= 0 && _x < n && _y < n) {
				if(a[_x][_y] == 1)
					dfs(_x, _y);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		s.nextLine();
		a = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String str = s.next();
			for(int j=0; j<n; j++) {
				a[i][j] = str.charAt(j) - '0';
			}
		}
		
		List<Integer> list = new ArrayList<>(); // 각 단지에 속하는 집의 수를 담을 list
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j] == 1) {
					count = 0;
					dfs(i, j);
					list.add(count);
				}
			}
		}
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for(int i: list)
			System.out.println(i);
	}
}
