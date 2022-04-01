package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class BOJ2667 {

    static int [][] map;
    static int count;
    static int dx[]={-1,1,0,0};
    static int dy[]={0,0,-1,1};
    static  LinkedList<Integer> list;
    public void dfs(int x,int y){
        count++;
        map[x][y]=0;
        for(int d=0;d<4;d++){
            int xx=x+dx[d];
            int yy=y+dy[d];
            if(xx<0||yy<0||xx>=map.length||yy>=map.length)continue;
            if (map[xx][yy]!=1)continue;
            dfs(xx,yy);
        }


    }




    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BOJ2667 bj=new BOJ2667();
        int n= Integer.parseInt(br.readLine()); // map size
        map=new int[n][n];
        list=new LinkedList<>();
        for(int i=0;i<n;i++){
            String st=br.readLine();
            for(int j=0;j<n;j++){
                map[i][j]=st.charAt(j)-'0';
            }
        }
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++)
            {
                if(map[i][j]==1){
                    count=0;
                    bj.dfs(i,j);
                    list.add(count);
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }











    }
}
/*
    test case 1:
    7
    0110100
    0110101
    1110101
    0000111
    0100000
    0111110
    0111000

    --------
    3
    7
    8
    9

*/
