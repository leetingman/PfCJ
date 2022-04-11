package boj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;
        while (true) {
            String str = br.readLine();
            if (str.length() == 1 && str.charAt(0) == '.') break;
            stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if(stack.size()==0) stack.push(str.charAt(i));
                    else if(stack.peek()=='(') stack.pop();
                    else stack.push(str.charAt(i));
                } else if(str.charAt(i)==']'){
                    if(stack.size()==0) stack.push(str.charAt(i));
                    else if(stack.peek()=='[') stack.pop();
                    else stack.push(str.charAt(i));
                }


            }
            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}


/*
    test case 1
    So when I die (the [first] I will see in (heaven) is a score list).
[ first in ] ( first out ).
Half Moon tonight (At least it is better than no Moon at all].
A rope may form )( a trail in a maze.
Help( I[m being held prisoner in a fortune cookie factory)].
([ (([( [ ] ) ( ) (( ))] )) ]).
 .
.
----------
yes
yes
no
no
no
yes
yes


*/

