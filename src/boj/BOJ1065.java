package boj;
// e p j
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int count=0;
        BOJ1065 b= new BOJ1065();
        boolean[] arr= new boolean[n];
        HashSet<Integer> set;
        for(int i=1;i<=arr.length;i++){
            set=new HashSet<>();
            int num=i;
            int front =0;
            int back =0;
            int sub=0;
            while(true){
               back= num%10;
               front= num/10%10;
               sub=front-back;
               num=num/10;
               set.add(sub);
               System.out.println(i+":"+set);
               if(num<10)break;
            }
            if(set.size()!=1){
                count++;
            }

        }
        System.out.println(arr.length-count);
    }
}
