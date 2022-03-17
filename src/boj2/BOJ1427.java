package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String num=br.readLine();
        StringBuilder sb= new StringBuilder();
        int []arr= new int[num.length()];
        for(int i=0;i<num.length();i++){
            arr[i]=num.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length;i>0;i--){
            sb.append(arr[i-1]-'0');
        }
        System.out.println(sb);

    }
}
