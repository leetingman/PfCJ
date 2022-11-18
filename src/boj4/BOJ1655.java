package boj4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> max=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int n= Integer.parseInt(br.readLine());

        for(int i=0; i<n;i++){
            int a= Integer.parseInt(br.readLine());
            if(max.size()==min.size()){
                max.add(a);
                if(!min.isEmpty() && max.peek()>min.peek()){
                    min.add(max.poll());
                    max.add(min.poll());
                }
            }
            else {
                min.add(a);
                if(max.peek() >min.peek()){
                    min.add(max.poll());
                    max.add(min.poll());
                }
            }
            System.out.println(max.peek());
        }
    }

}
