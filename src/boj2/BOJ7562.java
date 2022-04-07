package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7562 {

    static int [][]map;


    public void bfs(int a,int b){
        Queue<Node> que=new LinkedList<>();
        int[] dx={1,2,2,1,-1,-2,-2,-1};
        int[] dy={2,1,-1,-2,-2,-1,1,2};
        que.offer(new Node(a,b,1));
        while(!que.isEmpty()){
            Node node=que.poll();

            for(int i=0;i<dx.length;i++){
                int xx=node.x+dx[i];
                int yy=node.y+dy[i];

                if (xx >= 0 && yy >= 0 && xx < map.length && yy < map.length){
                    if(map[xx][yy]==2) {
                        System.out.println(node.n);
                        return;
                    }


                    if(map[xx][yy]==0){
                        map[xx][yy]=1;
                        que.offer(new Node(xx,yy,node.n+1));
                    }
                }
            }
        }


    }
    public class Node{
        public Node(int x, int y, int n) {
            this.x = x;
            this.y = y;
            this.n = n;
        }

        int x;
        int y;
        int n;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BOJ7562 boj =new BOJ7562();
        StringTokenizer st;
        int n= Integer.parseInt(br.readLine());
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for(int i=0;i<n;i++){
            int m= Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            a= Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            c= Integer.parseInt(st.nextToken());
            d= Integer.parseInt(st.nextToken());
            if(a==c&&b==d) {
                System.out.println(0);
            }
            else{
                map=new int [m][m];
                map[a][b]=1;
                map[c][d]=2;
                boj.bfs(a,b);
            }
        }




    }
}

/*
3
8
0 0
7 0
100
0 0
30 50
10
1 1
1 1
-------
5
28
0


*/

