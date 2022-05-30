package dfs;

public class DFS002 {
    static int [][] arr;
    static boolean[] visited;
    public static void dfs(int v){
        visited[v]= true;
        System.out.print(v+" ");
        if(v==arr.length)return;
        for(int a=1;a<arr.length;a++){
            if(arr[v][a]==1&&visited[a]==false)dfs(a);
        }
    }

    public static void main(String[] args) {

    }
}
