package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15650 {
    static int[] arr;
    static boolean[] checked;
    static StringBuilder sb= new StringBuilder();
    public void back(int dept,int a,int b){
        if(dept==b){
            for(int c:arr){

                sb.append((c)+" ");

            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=a;i++){
            if(!checked[i]){
                if(dept==0||arr[dept-1]<i) {
                    checked[i] = true;
                    arr[dept] = i;

                    back(dept + 1, a, b);
                    checked[i] = false;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        checked=new boolean[a+1];
        arr=new int [b];
        BOJ15650 bo=new BOJ15650();
        bo.back(0,a,b);
        System.out.println(sb);


    }
}
