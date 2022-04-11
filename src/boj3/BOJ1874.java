package boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int j = 1;
        boolean flag=true;
        stack.push(j);

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                if(stack.isEmpty()){
                    stack.push(j++);
                    sb.append("+");
                    sb.append("\n");
                }
                else if (arr[i] == stack.peek()) {
                    stack.pop();
                    sb.append("-");
                    sb.append("\n");
                    break;
                }
                else if(j>n){
                    System.out.println(j);
                    flag=false;
                    break;
                }
                else{
                    stack.push(j++);
                    sb.append("+");
                    sb.append("\n");
                }
            }
        }
        if(flag)
            System.out.println(sb);
        else
            System.out.println("NO");
//345
    }
}
