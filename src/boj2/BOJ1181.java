package boj2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] str= new String[n];
        for(int i=0;i<n;i++){
            str[i]=br.readLine();
        }



        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length()-o2.length();
                }

            }
        });
        System.out.println(str[0]);
        for(int i=1;i<str.length;i++){
            if(!str[i].equals(str[i-1])){
                System.out.println(str[i]);
            }
        }

    }
}
