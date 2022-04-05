package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7569inst {
    static int [][][]map;
    public void bfs(){
        int [] dx={-1,1,0,0,0,0};
        int [] dy={0,0,-1,1,0,0};
        int [] dl={0,0,0,0,-1,1};
        Queue<Node> que=new LinkedList<>();
        int day=0;

        //stuff que
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                for(int k=0;k<map[0][0].length;k++){
                    if(map[i][j][k]==1)que.offer(new Node(j,k,i));
                }
            }
        }

        while(!que.isEmpty()){
            Node node= que.poll();
            for (int i = 0; i < 6; i++) {
                int la = node.l + dl[i];
                int xx = node.x + dx[i];
                int yy = node.y + dy[i];
                if (la>=0&&la<map.length&&
                        xx >= 0 && yy >= 0 && xx < map[0].length && yy < map[0][0].length) {
                    if (map[la][xx][yy] == 0) {
                        map[la][xx][yy] = 1;
                        que.offer(new Node(xx,yy,la));

                    }



                }
            }

            day++;
        }
        if(isExist()){
            System.out.println(day);
        }else{
            System.out.println(-1);
        }



    }



    public boolean isExist(){
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                for(int k=0;k<map[0][0].length;k++){
                    if(map[i][j][k]==0) return false;
                }
            }
        }
        return true;
    }

    public class Node{
        int x;
        int y;
        int l;

        public Node(int x, int y, int l) {
            this.x = x;
            this.y = y;
            this.l = l;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        BOJ7569inst boj =new BOJ7569inst();

        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        int L= Integer.parseInt(st.nextToken());
        map=new int[L][M][N];
        for(int i=0;i<L;i++){
            for(int j=0;j<M;j++){
                st=new StringTokenizer(br.readLine());
                for(int k=0;k<N;k++){
                    map[i][j][k]= Integer.parseInt(st.nextToken());
                }
            }
        }
        boj.bfs();

    }
}
