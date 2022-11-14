package boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2580 {


    static int [][] map;


    public static void main(String[] args) throws IOException {
        BOJ2580 boj=new BOJ2580();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        map= new int[9][9];
        //input
        for(int i=0;i<9;i++){
            st= new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        //resolve
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(map[i][j]==0){
                    boj.resolve(i,j,1);
                }
            }
        }

        //output
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }


    }

    int resolve(int i,int j,int m){
        int x,y;
        map[i][j]=m;
        for(int a=0;a<9;a++){

            if(map[i][j]==map[i][a]&&j!=a){
                return resolve(i,j,m+1);
            }
            //section abc
            //i/3 j/3  -> result +3 result+3
            x=i/3;y=j/3;
            if(map[i][j]==map[x*3+a/3][y*3+a%3]&&
                    (i!=(x*3+a/3)&&j!=(y*3+a%3))
            ){
                return resolve(i,j,m+1);
            }
            else{
                map[i][j]=m;
                return 0;
            }

        }
        return 0;
    }

    // 가로 /3 세로 /3
    // compare 가로 세로 구역
    // when ?




}
