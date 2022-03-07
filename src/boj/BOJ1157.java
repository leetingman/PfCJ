package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int [] arr= new int[26];
        for(int i=0;i<str.length(); i++){
            if(65<= str.charAt(i)&&str.charAt(i)<=90){
                arr[str.charAt(i)-65]++;
            }
            else{
                arr[str.charAt(i)-97]++;
            }
        }
        int max=-1;
        char s=' ';
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                s=(char)(i+65);
            }else if(arr[i]==max){
                s= '?';
            }
        }

        System.out.println(s);


    }
}
