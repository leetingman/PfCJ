package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BOJ7576 boj = new BOJ7576();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

            }
        }

        boj.bfs();


    }

    public void bfs() {
        StringBuilder sb = new StringBuilder();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<Node> que = new LinkedList<>();
        int day=0;
        // divide procedure
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) que.offer(new Node(i, j, 0));
            }
        }


        while (!que.isEmpty()) {
            // 1 ci 2 ci

            Node node = que.poll();
            for (int i = 0; i < 4; i++) {
                int xx = node.x + dx[i];
                int yy = node.y + dy[i];
                if (xx >= 0 && yy >= 0 && xx < map.length && yy < map[0].length) {
                    if (map[xx][yy] == 0) {
                        map[xx][yy] = 1;
                        que.offer(new Node(xx, yy, node.d + 1));
                    }
                }
            }
            day=node.d;
        }
        sb.append(day);
        if(isExist())System.out.println(sb);
        else System.out.println(-1);
    }
    public boolean isExist(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0) return false;
            }
        }
        return true;
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


}






/*
    test case 1:
    6 4
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 1

    map N x M
    value 1 0 -1
    Algorithm BFS

    ---------------
    8

    test case 2:
    6 4
    0 -1 0 0 0 0
    -1 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 1

    --------------
    -1

*/
