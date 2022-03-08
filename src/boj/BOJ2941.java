package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        String[] croa={"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String st:croa){
            str=str.replaceAll(st,"a");
        }
        System.out.println(str.length());

    }
}
