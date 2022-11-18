package boj4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1238 {
//    private static ArrayList<ArrayList<Integer>> listGraph;
//
//    //init new LIST GRAPH
//    public void setListGraph(int initSize){
//        for(int i=0;i<initSize+1;i++){
//            listGraph.add(new ArrayList<Integer>());
//        }
//    }
//
//    public void putSinglePath(int x,int y){
//        listGraph.get(x).add(y);
//    }


    private static int[][]arr ;
    private static int maxtime;
    private static boolean[] check;
    private static int soloTime;


    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int place = Integer.parseInt(st.nextToken());//party place

        BOJ1238 bbb=new BOJ1238();
//        bbb.setListGraph(n);

        arr= new int[n+1][n+1];
//      init
        for(int i=0;i<m;i++){
            st =new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
            int t= Integer.parseInt(st.nextToken());
            arr[x][y]=t;
        }

//      dp?
        //현재위치 는 x
        for(int i=1;i<=n;i++){

            System.out.println(i+"++++++");
            System.out.println();
            check = new boolean[n];
            soloTime=Integer.MAX_VALUE;
            bbb.solution(i,place,0,i);
            if(soloTime>maxtime){
                maxtime=soloTime;
            }

            System.out.println(i);
            System.out.println();
        }

        System.out.println(maxtime);
    }
    //x is current place
    //p is party place
    public void solution(int x,int p,int toTime,int index){
        if(x == p){
            if(toTime<soloTime){
                System.out.println("cur totime "+toTime);
                returnSolution(p,index,toTime,0);
                soloTime=toTime;
            }
        }else if(!check[x-1]){
            for(int i=1;i<arr.length;i++){
                if(arr[x][i]!=0&&x!=i){
                    check[x-1]=true;
                    solution(i,p,toTime+=arr[x][i],index);
                    check[x-1]=false;
                }
            }
        }
    }

    public void returnSolution(int x,int p,int toTime,int d){
        System.out.println(x+" "+toTime);

        if(x==p){
            if(toTime<=soloTime){
                System.out.println(" max  "+toTime );
                soloTime=toTime;
            }
        }else {
            if(!check[x-1]) {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[x][i] != 0 && x != i) {
                        System.out.println(x + " " + i + " " + p + " " + toTime + " " + d);
                        check[x - 1] = true;
                        returnSolution(i, p, toTime += arr[x][i], d + 1);
                        check[x - 1] = false;
                    }
                }
            }
        }
    }
}
/**
 *4 8 2
 * 1 2 4
 * 1 3 2
 * 1 4 7
 * 2 1 1
 * 2 3 5
 * 3 1 2
 * 3 4 4
 * 4 2 3
 */