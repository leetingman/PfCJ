package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1260inst {
    static int [][]map;
    static boolean[] visited;
    static int N,M,start,end;


    public static void dfs(int point){
        Stack<Integer> stack=new Stack<>();
        stack.push(point);
        visited[point]=true;
        System.out.print(point+" ");
        while(!stack.isEmpty()){
            for(int i=1;i<=N;i++){
                if(map[point][i]==1&&visited[1]==false){
                    stack.push(i);
                    visited[i]=true;
                    dfs(i);
                }
            }
            stack.pop();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BOJ1260inst b=new BOJ1260inst();
        N= Integer.parseInt(br.readLine());
        M= Integer.parseInt(br.readLine());

        map=new int[N+1][N+1];
        visited=new boolean[N+1];
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            start= Integer.parseInt(st.nextToken());
            end= Integer.parseInt(st.nextToken());
            map[start][end]=1;
            map[end][start]=1;
        }
        dfs(1);
    }
}

/*
test case
7
8
1 2
1 3
2 4
2 5
3 7
4 6
5 6
6 7

 */