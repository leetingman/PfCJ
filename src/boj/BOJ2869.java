package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int day=(c-a)/(a-b);
        if(day*(a-b)+a>=c){
            System.out.println(day+1);
        }
        else{
            System.out.println(day+2);
        }


//        int count=1;
//        while (true){
//            c=c-a;
//            if(c<=0)break;
//            c+=b;
//            count++;
//        }
//        System.out.println(count);
    }
}
