package bfs_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 토마토
 * 철수의 토마토 농장에서는 토마토를 보관하는 큰 창고를 가지고 있다. 
 * 토마토는 아래의 그림과 같이 격자 모양 상자의 칸에 하나씩 넣어서 창고에 보관한다. 
 * 창고에 보관되는 토마토들 중에는 잘 익은 것도 있지만, 아직 익지 않은 토마토들도 있을 수 있다. 
 * 보관 후 하루가 지나면, 익은 토마토들의 인접한 곳에 있는 익지 않은 토마토들은 익은 토마토의 영향을 받아 익게 된다.
 * 하나의 토마토의 인접한 곳은 왼쪽, 오른쪽, 앞, 뒤 네 방향에 있는 토마토를 의미한다. 
 * 대각선 방향에 있는 토마토들에게는 영향을 주지 못하며, 토마토가 혼자 저절로 익는 경우는 없다고 가정한다. 
 * 철수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다.
 * 토마토를 창고에 보관하는 격자모양의 상자들의 크기와 익은 토마토들과 익지 않은 토마토들의 정보가 주어졌을 때, 며칠이 지나면 토마토들이 모두 익는지, 그 최소 일수를 구하는 프로그램을 작성하라. 
 * 단, 상자의 일부 칸에는 토마토가 들어있지 않을 수도 있다.
 */
class Tomato {
	int x;
	int y;
	
	Tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Num7576 {
	static int[][] a;
	static boolean[][] visit;
	
	static int n;
	static int m;
	static boolean flag = false;
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	static Queue<Tomato> q;
	
	public static void bfs() {
		
		while(!q.isEmpty()) {
			Tomato t = q.poll();
			int x = t.x;
			int y = t.y;
			
			visit[x][y] = true;
			
			for(int i=0; i<4; i++) {
				int _x = x + dx[i];
				int _y = y + dy[i];
				
				if(_x < n && _y <m && _x >= 0 && _y >= 0) {
					if(a[_x][_y] == 0 && !visit[_x][_y]) {
						q.add(new Tomato(_x, _y));
						a[_x][_y] = a[x][y] + 1;
						visit[_x][_y] = true;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		a = new int[n][m];
		visit = new boolean[n][m];
		q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j] == 1) 
					q.add(new Tomato(i, j));
			}
		}
		
		bfs();
		
		int max = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j] == 0) {
					flag = true;
				}
				max = Math.max(max, a[i][j]);
			}
		}
		
		if(flag)
			System.out.println(-1);
		else
			System.out.println(max-1);
	}
}
