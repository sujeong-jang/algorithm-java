package bfs_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 미로 탐색
 * 미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 
 * 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오. 
 * 한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.
 * 위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 
 * 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.
 */
public class Num2178 {
	//(dx, dy) : 우(0,1) 좌(0,-1), 상(-1,0), 하(1,0)
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	public static int n, m;
	public static int map[][]; // 배열
	public static boolean visit[][]; //방문 표시를 위한 배열
	
	//최단 거리를 구해야 하기 때문에 dfs를 사용!
	public static void bfs(int x, int y) { //시작 좌표 x,y
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		qx.add(x);
		qx.add(y);
		
		while(!qx.isEmpty() && !qy.isEmpty()) {
			x = qx.remove();
			y = qy.remove();
			visit[x][y] = true; // 방문 표시
			
			for(int i=0; i<4; i++) { // 오른쪽, 왼쪽, 위, 아래 돌아가면서 탐색
				int _x = x + dx[i];
				int _y = y + dy[i];
				
				if(_x >= 0 && _y >= 0 && _x < n && _y < m) {
					if(map[_x][_y] == 1 && !visit[_x][_y]) { //방문하지 않았다면
						qx.add(_x);
						qy.add(_y);
						visit[_x][_y] = true; // 방문 표시
						map[_x][_y] = map[x][y] + 1; //방문한 좌표는 이동 횟수로 변경
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		map = new int[100][100];
		visit = new boolean[100][100];
		
		for(int i=0; i<n; i++) {
			String tmp = s.next();
			for(int j=0; j<m; j++) {
				map[i][j] = tmp.charAt(j) - '0';
			}
		}
		
		bfs(0,0);
		System.out.println(map[n-1][m-1]);
	}
}
