package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2206 {
    static int[][] map;
    static boolean[][] visited;
    static int d;

    public void bfs() {
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(0, 0, 1,0));
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        visited = new boolean[map.length][map[0].length];
        while (!que.isEmpty()) {
            Node node = que.poll();
            if (node.x == map.length-1 && node.y == map[0].length-1)
            {
                d=node.d;
                break;
            }

            for (int k = 0; k < 4; k++) {
                int xx = node.x + dx[k];
                int yy = node.y + dy[k];
                if (xx >= 0 && yy >= 0 && xx < map.length && yy < map[0].length) {
                    if (map[xx][yy] == 0 && !visited[xx][yy]) {
                        visited[xx][yy]=true;
                        que.offer(new Node(xx, yy, node.d + 1,node.w));
                    }else{
                        if(node.w==0){
                            visited[xx][yy]=true;
                            que.offer(new Node(xx,yy,node.d+1,node.w+1));
                        }
                    }
                }

            }
        }

    }

    public class Node {
        int x;
        int y;
        int d;
        int w;

        public Node(int x, int y, int d, int w) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.w = w;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BOJ2206 boj = new BOJ2206();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        d=Integer.MAX_VALUE;
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        boj.bfs();
        if(d==Integer.MAX_VALUE){
            System.out.println(-1);
        }else System.out.println(d);


    }
}


/*
       test case 1:
       6 4
        0100
        1110
        1000
        0000
        0111
        0000
        -------------
        15

*/


