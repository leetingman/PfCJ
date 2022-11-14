package boj3;

import java.util.*;
import java.io.*;


public class Testss
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Stack <Integer> t = new Stack<Integer>();
        Stack <Integer>  s = new Stack<Integer>();
        StringTokenizer st;
        int N= Integer.parseInt(br.readLine());
        int[] result=new int[N];
        int cur;
        //Input
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            t.push(num);
            s.push(st.nextToken().charAt(0)-64);
            if(i==0)cur=num;
        }
        //Condition filter
        while(true){
            int n=t.pop();
            int c=s.pop();
            if(s.peek()==n){
                if(Math.abs(c-s.peek())==2){
                    result[N]=0;
                    N--;
                }else{
                    result[N]++;
                    N--;
                }
            }else{

            }

            if(t.empty()){
                break;
            }


        }
        //Output



    }
}