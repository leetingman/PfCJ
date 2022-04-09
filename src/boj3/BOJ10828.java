package boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            if(st.countTokens()==1){
                String s=st.nextToken();
                if(s.equals("top")){
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                }else if(s.equals("size")){
                    System.out.println(stack.size());
                }else if(s.equals("empty")){
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                }else if(s.equals("pop")){
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                }
            }else{
                String s= st.nextToken();
                int p= Integer.parseInt(st.nextToken());
                stack.push(p);
            }
        }
    }
}


/*
push 1
push 2
top vv
size v
empty v
pop
pop v
pop v
size v
empty v
pop
push 3
empty
top
2 top
2 size
0 emp
2 p
1 p
-1 p
0 si
-1 emp
-1 pop
0 emp
3 top

*/

