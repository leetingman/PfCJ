package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BOJ1316 bo=new BOJ1316();
        int N = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<N;i++){
            if(bo.check()){
                count++;
            }
        }
        System.out.println(count);
    }
    public boolean check() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        boolean [] num = new boolean[26];
        int cur=0;
        int pre=0;
        for(int i=0;i<str.length();i++){
            cur= str.charAt(i)-'a';
            if(cur==pre){
                num[cur]=true;
                pre=cur;
            }else{
                if(num[cur]==true){
                    return false;
                }
                else{
                    num[cur]=true;
                    pre=cur;
                }
            }
        }


        return true;
    }



}
