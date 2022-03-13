package boj;

import java.io.*;

public class BOJ2447 {
    static char[][] star;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(br.readLine());
        star = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                star[i][j]=' ';
            }
        }
        BOJ2447 b= new BOJ2447();
        b.pattern(n,0,0);
        for(int i=0;i<star.length;i++)
        {
            for(int j=0;j<n;j++){
                bw.write(star[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
    }
    // first make 1 st
    public void pattern(int n,int x,int y){
        if(n==1) star[y][x]='*';
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i==1&&j==1);
                    else pattern(n/3,y+n/3*i,x+n/3*j);
                }
            }
        }




    }

}
