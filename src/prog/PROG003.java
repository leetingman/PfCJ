package prog;

import java.util.PriorityQueue;



public class PROG003 {
    public static void main(String[] args) {
        PROG003 m= new PROG003();
        int[]s= {1, 2, 3, 9, 10, 12};

        System.out.println(m.solution(s,7));
    }
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap= new PriorityQueue<>();
        for(int i:scoville){
            heap.offer(i);
        }
        while(heap.peek()<K){
            if(heap.size()==1){
                return -1;
            }

            heap.offer(heap.poll()+(heap.poll()*2));
            answer++;

        }
        return answer;
    }
}
