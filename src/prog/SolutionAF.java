package prog;
//Programmers 67256
//kakao 키패드 누르기
public class SolutionAF {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keypad=new int [4][3];
        int distance=1;
        int cleft=10;
        int cright=12;
        for(int i=0;i<keypad.length;i++)
        {
            for(int j=0;j<keypad[i].length;j++){
                keypad[i][j]=distance++;
            }
        }
        for(int i=0;i<numbers.length;i++){
            distance=0;
            for(int j=0;j<keypad[0].length;j++){
                if(keypad[j][0]==numbers[i]){
                    answer+="L";
                    cleft=keypad[j][0];
                }else if(keypad[j][2]==numbers[i]){
                    answer+="R";
                    cright=keypad[j][2];
                }else if(keypad[j][1]==numbers[i]){

                    if(Math.abs(j-(cleft/4)+1-(cleft%3))<Math.abs(j-(cright/4)+1-(cright%3))){
                        answer+="L";
                        cleft=keypad[j][0];
                    }else if(Math.abs(j-(cleft/4)+1-(cleft%3))>Math.abs(j-(cright/4)+1-(cright%3))) {
                        answer += "R";
                        cright = keypad[j][2];
                    }
                    else{
                        if(hand=="right"){
                            answer += "R";
                            cright = keypad[j][2];
                        }else{
                            answer+="L";
                            cleft=keypad[j][0];
                        }
                    }



//                    if(Math.abs(cright-numbers[i])<Math.abs(cleft-numbers[i])){
//                        answer+="R";
//                        cright=keypad[j][2];
//                    }else if (Math.abs(cright-numbers[i])>Math.abs(cleft-numbers[i])){
//                        answer+="L";
//                        cleft=keypad[j][0];
//                    }else{
//                        answer+=hand;
//                    } 실수 :)
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        int[] num={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand="right";
        SolutionAF s=new SolutionAF();
        System.out.println(s.solution(num,hand));
    }
}
