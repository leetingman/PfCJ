package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<n;i++){
            double avg=0.0;
            st=new StringTokenizer(br.readLine());
            double[] arr= new double [Integer.parseInt(st.nextToken())];
            for(int j=0;j<arr.length;j++){
                arr[j]= Double.parseDouble(st.nextToken());
                avg+=arr[j];


            }
//            System.out.println(avg);
            double count=0.0;
            for(int j=0;j<arr.length;j++){
                if(avg/arr.length<arr[j]){
//                    System.out.println(arr[j]);
                    count++;
                }
            }
            avg=count/arr.length*100;
            //출력
            System.out.println(String.format("%.3f",avg)+"%");

            }
    }
}
