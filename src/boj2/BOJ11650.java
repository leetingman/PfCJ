package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        Map<Integer,String> map=new HashMap<>();
        StringTokenizer st;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            map.put(a*b,a+" "+b);
        }
        Iterator it=map.keySet().iterator();
        for(int i=0;i<n;i++){
            arr[i]= (int) it.next();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(map.get(arr[i]));

        }
    }
}
