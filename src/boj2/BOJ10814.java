package boj2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[][] str=new String[n][2];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            str[i][0]=st.nextToken();
            str[i][1]=st.nextToken();
        }
        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]),Integer.parseInt(o2[0]));
            }
        });
        for(int i=0;i<n;i++){
            bw.write(str[i][0]+" "+str[i][1]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
