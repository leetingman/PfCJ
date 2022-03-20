package boj2;

//Algorithm  Back Tracking: Solved by a series decisions, you might make a wrong decisions when you realize that you'll have to
//backtrack to place where you made a decisions and try something else that's all backtracking literally is a perfect

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15649 {
    static boolean[] check;
    static int [] arr;
    static StringBuilder sb= new StringBuilder();
    public void back(int dept,int n,int m){
        if(dept== m){
            for(int c:arr){
                sb.append((c+1)+" ");

            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){
            if(!check[i]){
                check[i]=true;
                arr[dept]=i;
                back(dept+1,n,m);
                check[i]=false;

            }
        }

        return;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        check=new boolean[n];
        arr=new int [m];
        BOJ15649 b=new BOJ15649();
        b.back(0,n,m);
        System.out.println(sb);


    }

}
