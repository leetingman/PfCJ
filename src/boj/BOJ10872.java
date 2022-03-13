package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        if(i==1){
            System.out.println("0");
        }else if(i==0){
            System.out.println("1");
        }
        else{
            BOJ10872 b=new BOJ10872();
            System.out.println(b.fact(i));
            int result=1;
            for(int j=2;j<=i;j++){
                result*=j;
            }
            System.out.println(result);

        }




    }
    public int fact(int i){
        if(i==1){
            return 1;
        }else {
            return i * fact(i - 1);
        }
    }
}
