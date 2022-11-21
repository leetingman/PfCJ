package prog;

import java.util.PriorityQueue;

public class PROG004 {

    public static void main(String[] args) {

    }
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[]> heap=new PriorityQueue<>();
        int end = 0 ;
        int count =0;
        int i=0;
        while(count<jobs.length){
            while(i<jobs.length&&jobs[i][0]<=end){
                heap.offer(jobs[i++]);
            }
            if(heap.isEmpty()){
                end=jobs[i][0];
            }else{
                int[] tmp=heap.poll();
                answer+= tmp[1]+end-tmp[0];
                end +=tmp[1];
                count++;
            }
        }
        answer=answer/ jobs.length;

        return answer;
    }
}
