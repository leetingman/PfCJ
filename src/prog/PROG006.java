package prog;

import java.util.Arrays;

public class PROG006 {
    public static void main(String[] args) {
        PROG006 p = new PROG006();
        int arr[] ={1, 2, 3, 1, 2, 3, 1};
        System.out.println(p.solution(3,4,arr));
    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        if(m>score.length)return 0;
        Arrays.sort(score);
        int cnt=m;
        for(int i=score.length;i>0;i--){
           cnt--;
            if(cnt==0){
                answer+= score[i-1]*m;
                cnt=m;
            }
        }

        return answer;
    }

}
