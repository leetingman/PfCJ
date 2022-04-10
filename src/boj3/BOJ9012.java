package boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str=br.readLine();
            Stack<Character> s=new Stack<>();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='('){
                    s.push(str.charAt(j));
                }else{
                    if(s.size()==0){
                        s.push(str.charAt(j));
                        break;
                    }
                    else s.pop();
                }
            }
            if(s.isEmpty()) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}

/*
    test case 1:
    (()())((())) -> yes

*/

