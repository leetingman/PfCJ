package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> list=new HashSet<>();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] =Integer.parseInt(br.readLine());
            list.add(arr[i]%42);
        }
        System.out.println(list.size());
    }

}
