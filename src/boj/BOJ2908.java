package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A= Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());

        int B= Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());

        if(A>B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }
    }
}