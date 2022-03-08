package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        int sum=0;
        String[] str={"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        for(int i=0;i<s.length();i++){
            for(int j=0;j<str.length;j++){
                if(str[j].indexOf(s.charAt(i))>=0){
                    sum=sum+j+3;
                }
            }
        }
        System.out.println(sum);

    }

}
