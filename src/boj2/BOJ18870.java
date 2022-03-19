package boj2;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(br.readLine());
        int [] arr= new int [n];
        int[] rank=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        rank=arr.clone();
        Arrays.sort(rank);
        int count=0;
        for(int i=0;i<rank.length;i++){
            if(!map.containsKey(rank[i])){
                map.put(rank[i],count++);
            }
        }
        for(int i=0;i<n;i++){
            bw.write(map.get(arr[i])+" ");
        }


        br.close();
        bw.flush();
        bw.close();

    }
}
