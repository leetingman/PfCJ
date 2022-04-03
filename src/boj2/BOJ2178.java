package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {


    public void bfs(int[][] map) {
        StringBuilder br = new StringBuilder();
        boolean[][] checked = new boolean[map.length][map[0].length];
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(0, 0, 1));
        checked[0][0] = true;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while (!que.isEmpty()) {
            Node node = que.poll();
            if (node.x == map.length-1 && node.y == map[0].length-1)
            {
                br.append(node.d);
                break;
            }
            for (int i = 0; i < 4; i++) {
                int xx = node.x + dx[i];
                int yy= node.y+dy[i];
                if(xx>=0&&yy>=0&&xx<map.length&&yy<map[0].length){
                    if(map[xx][yy]==1&& !checked[xx][yy]) {
                        checked[xx][yy] = true;
                        que.offer(new Node(xx, yy, node.d + 1));
                    }
                }
            }
        }
        System.out.println(br);

    }

    public class Node {
        int x;
        int y;
        int d;

        public Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BOJ2178 boj = new BOJ2178();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        boj.bfs(map);
        br.close();



    }


}


/*
    testcase 1:
    4 6
    101111
    101010
    101011
    111011
    --------------
    15



*/
