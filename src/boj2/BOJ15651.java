package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//backtracking backjoon
public class BOJ15651 {
    static int [] arr;
    static StringBuilder sb=new StringBuilder();
    public void solution(int dept,int n,int m){
        if(dept==m){
            for(int c:arr){
                sb.append((c+1)+" ");

            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){
                    arr[dept] = i;
                    solution(dept + 1, n, m);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        arr=new int[m];
        BOJ15651 sol=new BOJ15651();
        sol.solution(0,n,m);
        System.out.println(sb);
    }
}
