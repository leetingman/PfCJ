package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// h=floor w=room number n= num roomNum

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        StringTokenizer st;
        int roomNum;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            roomNum=0;
            int h= Integer.parseInt(st.nextToken());
            int w= Integer.parseInt(st.nextToken());
            int n= Integer.parseInt(st.nextToken());
            if(n%h==0){
                roomNum+=(h*100)+(n/h)-1;
            }else{
                roomNum+=(n%h)*100+(n/h);
            }
            System.out.println(roomNum+1);
        }


    }
}
