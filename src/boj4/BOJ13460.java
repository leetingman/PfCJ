package boj4;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13460 {
    static int[] dx={-1,0,1,0};
    static int[] dy={0,-1,0,1};
    static String [][] map;
    static boolean [][] check;
    static boolean [][] checkb;
    static int result =0;

    public static void main(String[] args) throws IOException {
        BOJ13460 ll =new BOJ13460();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int m= Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());
        int [][] rbo=new int[2][2];
        map=new String[m][n];
        check =new boolean[m][n];
        checkb =new boolean[m][n];
        // init
        for(int i=0;i<m;i++){
            String str=br.readLine();
            for(int j=0;j<n;j++){
                map[i][j]=String.valueOf(str.charAt(j));
                if(String.valueOf(str.charAt(j)).equals("R")) {
                    rbo[0][0] =i;
                    rbo[0][1] =j;
                }
                if(String.valueOf(str.charAt(j)).equals("B")){
                    rbo[1][0] =i;
                    rbo[1][1] =j;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        ll.dfs(0,rbo[0][0],rbo[0][1],rbo[1][0],rbo[1][1]);

        System.out.println(result);


    }

    public void dfs(int d,int rx,int ry,int bx,int by){
        if(map[rx][ry].equals("0")&&d<=10){
            result=d;
        }
        if(!check[rx][ry]&&!checkb[bx][by]){
            for(int i=0;i<4;i++){
                while(true){
                    int nx = rx+dx[i];
                    int ny = ry+dy[i];
                    int mx = bx+dx[i];
                    int my = by+dx[i];
                    String r= map[nx][ny];
                    String b= map[mx][my];
                    if(r.equals("#")&&r.equals("B")&&b.equals("#")&&b.equals("R")||r.equals("0")){
                        check[rx][ry]=true;
                        checkb[bx][by]=true;
                        dfs(d+1,rx,ry,bx,by);
                        break;
                    }
                }

            }
        }


    }
}
