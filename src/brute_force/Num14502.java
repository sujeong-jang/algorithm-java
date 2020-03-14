package brute_force;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 연구소
 * 인체에 치명적인 바이러스를 연구하던 연구소에서 바이러스가 유출되었다. 
 * 다행히 바이러스는 아직 퍼지지 않았고, 바이러스의 확산을 막기 위해서 연구소에 벽을 세우려고 한다.
 * 연구소는 크기가 N×M인 직사각형으로 나타낼 수 있으며, 직사각형은 1×1 크기의 정사각형으로 나누어져 있다. 
 * 연구소는 빈 칸, 벽으로 이루어져 있으며, 벽은 칸 하나를 가득 차지한다. 
 * 일부 칸은 바이러스가 존재하며, 이 바이러스는 상하좌우로 인접한 빈 칸으로 모두 퍼져나갈 수 있다. 
 * 새로 세울 수 있는 벽의 개수는 3개이며, 꼭 3개를 세워야 한다.
 * 0은 빈 칸, 1은 벽, 2는 바이러스가 있는 곳이다. 아무런 벽을 세우지 않는다면, 바이러스는 모든 빈 칸으로 퍼져나갈 수 있다.
 */

public class Num14502 {
	static int[][] a;
	static boolean[][] visited;
	static int n, m;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = br.read();
		m = br.read();
		a = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				a[i][j] = s.charAt(j) - '0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i][j] == 2)
					bfs(i, j);
			}	
		}
	}
	
	public static void bfs(int x, int y) {
		int[] dx = {0, -1, 0, 1};
		int[] dy = {-1, 0, 1, 0};
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<4; i++) {
			int _x = x + dx[i];
			int _y = y + dy[i];
			
			if(_x > 0 && _y > 0 && _x > n && _y > m) {
				queue.add(a[_x][_y]);
				visited[_x][_y] = true;
			}
			
			while(!queue.isEmpty()) {
				int q = queue.remove();
				
			}
			
			
		}
	}

}
