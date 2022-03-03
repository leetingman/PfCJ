package prog;
//kakao 크레인 인형뽑기
//https://programmers.co.kr/learn/courses/30/lessons/64061
//prog64061
import java.util.Stack;

class SolutionAB {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][moves[i] - 1]);
//                        System.out.println("stack is empty");
                    } else {
                        if (stack.peek() == board[j][moves[i] - 1]) {
//                            System.out.println(board[j][moves[i] - 1] + " is same " + stack.peek());

//                            System.out.println("before stack:" + stack);
                            stack.pop();
//                            System.out.println("after stack:" + stack);
                            answer += 2;
                        } else {
                            stack.push(board[j][moves[i] - 1]);
                        }
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
//            System.out.println(stack);
        }
        return answer;
    }

    public static void main(String[] args) {
        SolutionAB s = new SolutionAB();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int answer = s.solution(board, moves);
        System.out.println(answer);
    }
}

