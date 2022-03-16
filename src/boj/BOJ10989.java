package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        // Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int []arr=new int [n];
        int max=0;
        int []result=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            arr[i]= Integer.parseInt(br.readLine());
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int [] count=new int [max]; // default =0
        //Counting Sort
        for(int i=0;i<arr.length;i++){
            count[arr[i]-1]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<arr.length;i++){
            result[--count[arr[i]-1]]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }
        // time over -

    }
}
