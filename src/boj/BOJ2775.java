package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//if 4 f     = 1/ 6 21 56 126 252
//if 3 f     = 1/ 5 15 35 70 126
//if 2 f     = 1/ 4 10 20 35  56
//if 1 f     = 1/ 3  6 10 15  21
//if 0 f     = 1/ 2  3  4  5   6

public class BOJ2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int result;
        for(int i=0;i<n;i++){
            result=0;
            int a= Integer.parseInt(br.readLine());
            int b= Integer.parseInt(br.readLine());
            int[][] arr=new int[a][b];

            if(b==1){
                System.out.println("1");
            }
            else{
                for(int j=0;j<b;j++){
                    arr[0][j]=j+1;
                }
                for(int j=0;j<a;j++){
                    arr[j][0]=1;
                }

                for(int j=1;j<a;j++){
                    for(int k=2;k<b;k++){
                        arr[j][k]=arr[j][k-1]+arr[j-1][k];
                    }
                }

            } System.out.println(arr[a][b]);






        }
    }
}
