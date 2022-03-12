package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder one=new StringBuilder();
        StringBuilder two =new StringBuilder();
        one.append(st.nextToken());
        two.append(st.nextToken());
        if(one.length()<two.length()){
            StringBuilder comp=new StringBuilder();
            comp=two;
            two=one.reverse();
            one=comp.reverse();
            for(int i=0;i<one.length()-two.length();i++){
                two.append("0");
            }
        }
        boolean add=false;
        StringBuilder nnum=new StringBuilder();
        for(int i=0;i<one.length();i++){

            int a=one.charAt(i)-'0'+two.charAt(i)-'0';
            System.out.println(a);
            if(add){
                a++;
            }
            add=false;
            if(a>=10){
                add=true;
            }
            nnum.append(a%10);
            if(i==one.length()){
                nnum.append(a/10);
            }
        }
        System.out.println(nnum.reverse());

        //solution 2









    }
}
