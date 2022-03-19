package prog;
//Programmers 12973
//짝지어 제거하기 -짝제 짱제 짱

import java.util.Stack;

public class SolutionAJ {
    public int solution(String s)
    {
        int answer=0;
        Stack<Character> stack =new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.empty()&&stack.peek().equals(ch))
            {
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        if(stack.isEmpty())return 1;
        else return 0;
    }
    public static void main(String[] args) {
        SolutionAJ s=new SolutionAJ();
        int i=s.solution("baabaa");
        System.out.println(i);
    }

}
