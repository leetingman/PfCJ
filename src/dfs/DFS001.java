package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS001 {
    static int [][] arr;
    static boolean[] visited;
    public static void dfs(int v){
        visited[v]= true;
        System.out.print(v+" ");
        if(v==arr.length)return;
        for(int a=1;a<arr.length;a++){
            if(arr[v][a]==1&&visited[a]==false)dfs(a);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int v= Integer.parseInt(st.nextToken());
        arr= new int [n+1][n+1];
        visited= new boolean[n+1];
        for(int i=1;i<=m;i++){
            st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            arr[a][b]=1;
            arr[b][a]=1;
        }
        dfs(v);



    }
}
