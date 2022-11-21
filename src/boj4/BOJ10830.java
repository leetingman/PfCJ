package boj4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10830 {
    public static void main(String[] args) throws IOException {
        BOJ10830 b = new BOJ10830();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        int[][] arr = new int[n][n];
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }
        result = b.div(arr, x);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] div(int[][] arr, long x) {
        if (x != 1L) {
            int[][] temp = div(arr, x / 2);
            temp = calc(temp, temp);

            if (x % 2 == 1L) {
                temp = calc(arr, temp);
            }
            return temp;

        } else {
            return arr;
        }
    }

    //cij= ai1b1j+.....ainbnj
    public int[][] calc(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    c[i][j] %= 1000;
                }
            }
        }
        return c;
    }
}

