package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7569 {
    static int[][] map;
    static LinkedList<int[][]> list;


    public void bfs(){
        int [] dx={-1,1,0,0,0,0};
        int [] dy={0,0,-1,1,0,0};
        int [] dl={0,0,0,0,-1,1};
        Queue<Node> que=new LinkedList<>();
        int day=0;

        //stuff que
        for(int i=0;i<list.size();i++){
            map=list.get(i);
            for(int j=0;j<map.length;j++){
                for(int k=0;k<map[0].length;k++){
                    if(map[j][k]==1)que.offer(new Node(j,k,i,0));
                }
            }
        }

        while(!que.isEmpty()){
            Node node= que.poll();
            for (int i = 0; i < 6; i++) {
                int la = node.l + dl[i];
                int xx = node.x + dx[i];
                int yy = node.y + dy[i];
                if (la>=0&&la<list.size()&&
                        xx >= 0 && yy >= 0 && xx < map.length && yy < map[0].length) {
                    map=list.get(la);
                    if (map[xx][yy] == 0) {
                        map[xx][yy] = 1;
                        que.offer(new Node(xx,yy,la,node.d+1));
                        list.set(la,map);
                    }



                }
            }
            day=node.d;
        }
        if(isExist()){
            System.out.println(day);
        }else{
            System.out.println(-1);
        }

    }

    public boolean isExist(){
        for(int i=0;i<list.size();i++){
            map=list.get(i);
            for(int j=0;j<map.length;j++){
                for(int k=0;k<map[0].length;k++){
                    if(map[j][k]==0)return false;
                }
            }
        }
        return true;
    }

    public class Node{
        int x;
        int y;
        int l;
        int d;
        public Node(int x, int y, int l, int d) {
            this.x = x;
            this.y = y;
            this.l = l;
            this.d = d;
        }


    }


    public static void main(String[] args) throws IOException {
        //init
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        BOJ7569 boj =new BOJ7569();

        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        int L= Integer.parseInt(st.nextToken());
        list = new LinkedList<>();
        map=new int[M][N];
        for(int i=0;i<L;i++){
            for(int j=0;j<M;j++){
                st=new StringTokenizer(br.readLine());
                for(int k=0;k<N;k++){
                    map[j][k]= Integer.parseInt(st.nextToken());
                }
            }
            list.add(map);
        }
        boj.bfs();

    }
}

/*
    test case 1 :
    5 3 1
    0 -1 0 0 0
    -1 -1 0 1 1
    0 0 0 1 1
    ----------
    -1

    test case 2:
    5 3 2
    0 0 0 0 0
    0 0 0 0 0
    0 0 0 0 0
    0 0 0 0 0
    0 0 1 0 0
    0 0 0 0 0

    -----------
    4






*/


