package boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int result=0;
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int k= Integer.parseInt(st.nextToken());
            int count =0;
            for(int j=1;j<=k;j++){
                if(k%j==0){
                    count++;
                }
            }
            if(count == 2){
                result++;
            }
        }
        System.out.println(result);
    }

}
