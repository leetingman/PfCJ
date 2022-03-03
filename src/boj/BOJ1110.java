package boj;

import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn=n;
        int count=0;
        while(true){

            int ten = nn / 10;
            int one = nn % 10;
            nn=one*10+(ten+one)%10;
            count++;
            if(n==nn){
                break;
            }

        }
        System.out.println(count);

    }
}
