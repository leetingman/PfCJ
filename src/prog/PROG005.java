package prog;

import java.util.ArrayList;

public class PROG005 {

        public static void main(String[] args) {
            PROG005 p =new PROG005();
            System.out.println(p.solution(10,3,2));
        }
        public int solution(int number, int limit, int power) {
            int answer = 0;

            for(int i=1;i<=number;i++){
                int j=calc(i);
                System.out.println(j);
                if (limit>=j)answer+=j;
                else answer+=power;

//                System.out.println("answer=" +answer);
            }


            return answer;
        }
        public int calc(int k){
            int count =0;
            for(int i=1;i<=k;i++){
                System.out.println(k+"%"+i+" "+k%i);
                if(k%i==0)count++;
            }
//            System.out.println(count);
            return count;
        }
}
