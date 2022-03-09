package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1712 {
    public static void main(String[] args) throws IOException {
        //A :고정비용 B:가변비용 C:노트북 가격
        // Break-even point =  C>A+B
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        if(c<=b){
            System.out.println("-1");
        }else{
            System.out.println(a/(c-b)+1);
        }



//        while(true){
//            if(b>=c){
//                i=-1;
//                break;
//            }
//            else if(a/i+(b)<c)
//            {
//                break;
//            }
//            i++;
//        }




    }
}
