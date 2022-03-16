package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이

public class BOJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int []arr=new int [n];
        int  b=0;
        int c=0;
        double a=0;
        int d=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            arr[i]= Integer.parseInt(br.readLine());
            map.put(arr[i],0);
        }
        Arrays.sort(arr);
        d=arr[arr.length-1]-arr[0];
        for(int i=0;i<arr.length;i++){
            a+=arr[i];
            map.put(arr[i],map.get(arr[i])+1);
        }
        Iterator<Integer>iter=map.keySet().iterator();
        while(iter.hasNext()){
            int num=iter.next();
            if(c<num){
                c=num;
            }
        }
        a=(int)Math.round(a)/arr.length;
        b=arr[arr.length/2];
        System.out.println((int)a+"\n"+b+"\n"+c+"\n"+d);

    }

}
