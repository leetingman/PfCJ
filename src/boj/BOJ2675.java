package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int m= Integer.parseInt(br.readLine());
        StringBuilder sb;
        for(int i =0;i<m;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            sb=new StringBuilder();
            int n= Integer.parseInt(st.nextToken());
            String str=st.nextToken();
            for(int j=0;j<str.length();j++){
                for(int k=0;k<n;k++){
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb);
        }

    }
}
