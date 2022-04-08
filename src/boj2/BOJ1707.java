package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1707 {
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T= Integer.parseInt(br.readLine());//test case
        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            int v= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());



        }

    }
}


/*
    test case 1:
    2
    3 2
    1 3
    2 3
    4 4
    1 2
    2 3
    3 4
    4 2

    result :
    YES
    NO




*/

