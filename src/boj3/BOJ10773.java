package boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack= new Stack<>();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int k= Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            int t= Integer.parseInt(br.readLine());
            if(t==0){
                stack.pop();
            }else{
                stack.push(t);
            }
        }
        k=0;
        if(stack.size()==0){
            System.out.println(0);
        }else{
            while(!stack.isEmpty()){
                k+=stack.pop();
            }
            System.out.println(k);
        }
    }
}
