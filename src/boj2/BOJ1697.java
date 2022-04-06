package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//연산결과로 뿌리 내리기

public class BOJ1697 {

    static boolean [] visited=new boolean[1000001];

    public void bfs(int x,int y){
        Queue<Node> que =new LinkedList<>();
        que.offer(new Node(x,1));
        visited[x]=true;
        int n=0;
        while(!que.isEmpty()){
            Node node=que.poll();
            n++;
            for(int i=0;i<3;i++){
                int nextNum;
                if(i==0){
                    nextNum=node.x+1;
                }else if(i==1){
                    nextNum=node.x-1;
                }else{
                    nextNum=node.x*2;
                }
                if(nextNum==y){
                    System.out.println(node.d);
                    return ;
                }

                if(nextNum>=0&&nextNum<visited.length&&visited[nextNum]==false){
                    que.offer(new Node(nextNum,node.d+1));
                    visited[nextNum]=true;
                }
            }
        }

    }

    public class Node{
        int x;
        int d;

        public Node(int x,int d) {
            this.x = x;
            this.d = d;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        BOJ1697 boj =new BOJ1697();
        int x= Integer.parseInt(st.nextToken());
        int y= Integer.parseInt(st.nextToken());

        if(x==y){
            System.out.println(0);
        }else boj.bfs(x,y);


    }
}

/*
    test case 1:
    5 17
    -------
    4


*/

