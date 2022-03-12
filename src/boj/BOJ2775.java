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
        int[][] arr= new int[15][15];
        for(int i=0;i<15;i++){
            arr[i][0]=1;
            arr[0][i]=i+1;
        }
        //handle function
        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        //print
        for(int i=0;i<n;i++){
            int a= Integer.parseInt(br.readLine());
            int b= Integer.parseInt(br.readLine());
            System.out.println(arr[a][b-1]);
            //test case 1 3 :6  v
            //test case 2 3 :10  v
            //test case 2 4 :20  v

        }



    }
}
