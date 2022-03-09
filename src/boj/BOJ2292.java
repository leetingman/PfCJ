package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1: 1 , 2:2~7 ,3:8~19, 4:20~37
//6 6*2 6*3 : d

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int pre=2;
        int i=0;

        while(true){
            if(n/(pre+(6*i))==0){
                break;
            }
            pre=pre+6*i;
            i++;
        }
        System.out.println(i+1);

    }
}
