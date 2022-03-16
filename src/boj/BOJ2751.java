package boj;

import java.io.*;
import java.util.Arrays;

public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(br.readLine());
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= Integer.parseInt(br.readLine());

        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]+"\n");
        }
        System.out.println(sb);
    }
}
