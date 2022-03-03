package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in
        ));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        sb.append(a[0] + " " + a[n - 1]);
        System.out.println(sb);


    }

}
