package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] str=new String[n];
        for(int i=0;i<str.length;i++){
            str[i]=br.readLine();
        }
        int count =0;
        int sum =0;
        for(String st:str){
            count=0;
            sum=0;
            System.out.println("init"+sum);
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)!='X'){
                    count++;
                }else{
                    count=0;
                }sum+=count;
            }
            System.out.println(sum);
        }
    }
}
