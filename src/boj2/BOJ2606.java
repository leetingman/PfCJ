package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2606 {

    static boolean[] visited;
    static int[][] map;
    static int count;
    public void dfs(int x){
        visited[x]=true;
        count++;
        for(int i=1;i<visited.length;i++){
            if(visited[i]==false&&map[x][i]==1){
                dfs(i);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BOJ2606 boj=new BOJ2606();


        int n= Integer.parseInt(br.readLine()); // num of com
        int m= Integer.parseInt(br.readLine()); // num of conn

        map=new int[n+1][n+1];
        visited=new boolean[n+1];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            map[a][b]=1;
            map[b][a]=1;
        }
        boj.dfs(1);
        System.out.println(count-1);

    }
}

/*
    test case 1:
    7
    6
    1 2
    2 3
    1 5
    5 2
    5 6
    4 7

       4    1-2- 3
       |     \|
       7      5- 6


    -------
    4




*/
