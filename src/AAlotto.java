//java 으떻게 하는지 까먹음 :) 조졌다~


public class AAlotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zcount = 0;
        int result = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zcount++;
            }
            for (int j = 0; j < win_nums.length; j++) {
                //compare
                if (lottos[i] == win_nums[j])result++;
            }
        }
        answer[0] = result;
        answer[1] = result + zcount;


        return answer;
    }

    public static void main(String[] args) {

        AAlotto a = new AAlotto();

        int[] lottos = {1, 2, 3, 4, 5, 0};
        int[] win_nums = {1, 2, 3, 4, 15, 41};
        int[] answer = a.solution(lottos, win_nums);
        for(int i=0;i<answer.length;i++){
            System.out.println("answer = " + answer[i]);
        }

    }
}
