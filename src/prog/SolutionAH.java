package prog;
// upper west side
// World code challenge 없는 숫자 더하기

public class SolutionAH {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0;i<numbers.length;i++){
            answer-=numbers[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,6,7,8,0};
        SolutionAH s=new SolutionAH();
        System.out.println(s.solution(numbers));
    }
}
