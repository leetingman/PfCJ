package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//100 joon N-Queen
//cmd+opt+L
//
public class BOJ9663 {

    static int N;
    static int[] arr;
    static int count;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int current) {
        if(current == N) {
            count++;
            return;
        }
        for(int i=0; i<N; i++) {
            if(check(current, i)) {
                arr[current] = i;
                dfs(current+1);
            }
        }
    }

    public static boolean check(int current, int idx) {
        for(int i=0; i<current; i++) {
            if(arr[i] == idx) return false;
            if(Math.abs(i - current) == Math.abs(arr[i] - idx)) return false;
        }
        return true;
    }
}