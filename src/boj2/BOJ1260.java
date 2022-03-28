package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {
    static ArrayList<Integer>[] list;
    static int n;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int start= Integer.parseInt(st.nextToken());
        //        n= Integer.parseInt(br.readLine());
        list = new ArrayList[n+1];
        for(int i=1;i<n+1;i++){
            list[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());

            int u= Integer.parseInt(st.nextToken());
            int v= Integer.parseInt(st.nextToken());

            list[u].add(v);
            list[v].add(u);
        }

        for(int i=1;i<n+1;i++){
            Collections.sort(list[i]);
        }
        check= new boolean[n+1];
        dfs(start);
        System.out.println();
        check= new boolean[n+1];
        bfs(start);
        System.out.println();

        br.close();

    }
    public static void dfs(int x){
        if(check[x]){
            return;
        }
        check[x]=true;
        System.out.print(x+" ");
        for(int y:list[x]){
            if(!check[y]){
                dfs(y);
            }
        }
    }
    public static void bfs(int start){
        Queue<Integer> queue =new LinkedList<Integer>();
        queue.add(start);
        check[start]=true;
        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x+ " ");
            for( int y:list[x]){
                if(!check[y]){
                    check[y]= true;
                    queue.add(y);
                }
            }
        }
    }
}
