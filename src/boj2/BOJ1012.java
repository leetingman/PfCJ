package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1012 {

    static boolean[] visited;
    static int [][] map;
    static int [] dx={-1,1,0,0};// dir key
    static int [] dy={0,0,-1,1};
    static int count;

    public void dfs(int x,int y){
        int xx;
        int yy;
        map[x][y]=0;
        for(int l=0;l<dx.length;l++){
            xx=x-dx[l];
            yy=y-dy[l];

            if(xx<0||xx>=map.length||yy<0||yy>=map[0].length)continue;
            if(map[xx][yy]!=1)continue;
            dfs(xx,yy);
        }



    }


    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BOJ1012 bj=new BOJ1012();
        StringTokenizer st;

        int T= Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            int N= Integer.parseInt(st.nextToken());
            int M= Integer.parseInt(st.nextToken());
            int K= Integer.parseInt(st.nextToken());
            map=new int[N][M];
            //visited[] data

            for(int j=0;j<K;j++){
                st=new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=1;
            }

            //dfs start p runtime err
            for(int a=0;a<N;a++){
                for(int b=0;b<M;b++){
                    if(map[a][b]==1){
                        bj.dfs(a,b);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count=0;

        }
    }
}


/*
    testcase  1:
        2   //T num testcase
        10 8 17  // M N K
        0 0
        1 0
        1 1
        4 2
        4 3
        4 5
        2 4
        3 4
        7 4
        8 4
        9 4
        7 5
        8 5
        9 5
        7 6
        8 6
        9 6

        10 10 1
        5 5

        ---------------
        5
        1



*/
