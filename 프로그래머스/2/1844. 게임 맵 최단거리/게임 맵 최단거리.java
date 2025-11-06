import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[][]dist = new int[n][m]; //방문
        int[] dx = {1, -1, 0, 0}; // 방향
        int[] dy = {0, 0, 1, -1};
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0}); // 시작 위치    
        dist[0][0] = 1;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            for(int i = 0; i < 4; i++){
             int nx = x + dx[i];
             int ny = y + dy[i];

             if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue; //맵 벗어남
             if(maps[nx][ny] == 0) continue; // 벽
             if(dist[nx][ny]!=0) continue; //방문 여부
             
             dist[nx][ny] = dist[x][y] + 1;
             q.add(new int[]{nx, ny});   
            }
        }
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}