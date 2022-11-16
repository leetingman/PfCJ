package boj4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ12100 {
    static int [][]map;
    static int maxNum =0;
//    int []dx={-1,0,1,0};
//    int []dy={0,-1,0,1};
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        map=new int[m][m];
        for(int i=0;i<m;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        BOJ12100 b=new BOJ12100();
        b.dfs(0);
        System.out.println(maxNum);
    }

    public void dfs(int d){
        if(d==5){
            for(int i=0;i< map.length;i++){
                for(int j=0;j< map.length;j++){
                    if(map[i][j]>maxNum){
                        maxNum=map[i][j];
                    }
                }
            }

        }else if(d<5){
            for(int i=0;i<4;i++) {

                if(i==0){
                    //left
                    int index = 0;
                    int block = 0;
                    for(int j=0;j< map.length;j++){
                        for(int k=0;k<map.length;k++){
                            if(map[j][k]!=0){
                                if(block==map[i][j]){
                                    map[i][index-1]=block*2;
                                    block =0;
                                    map[i][j]=0;
                                }
                                else{
                                    block =map[i][j];
                                    map[i][j]=0;
                                    map[i][index]=block;
                                    index++;
                                }
                            }
                        }
                    }
                }
                if(i==1){}
                if(i==2){}
                if(i==3){}

            }
        }

    }


}
