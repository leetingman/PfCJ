package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int best=n;
        //n = 3*x+5*y (0<=x,y<=@)
        //if n/(3*x+5*y) ==0 then answer = -1;
        //best = min(x+y)
        //5 10 15 3 6 9 == On*n
        for(int i=0;i<n/5+1;i++){
            for(int j=0;j<n/3+1;j++){
                    if(n==i*5+j*3){
                        if(best>i+j){
                            System.out.println(i);
                            System.out.println(j);
                            best=i+j;
                        }
                    }
            }
        }
        if(best==n){
            System.out.println(-1);
        }
        else{
            System.out.println(best);
        }


        //solution 2

        if (n == 4 || n == 7) {
            System.out.println(-1);
        }
        else if (n % 5 == 0) {
            System.out.println(n / 5);
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            System.out.println((n / 5) + 1);
        }
        else if (n % 5 == 2 || n % 5 == 4) {
            System.out.println((n / 5) + 2);
        }
    }
}
