package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //System.out.println("숫자입력해 :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num;
        num=Integer.parseInt(br.readLine());

        for(int i=0; i<num;i++) {
            for(int j=num-1; j>i-1; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
