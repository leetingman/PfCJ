package prog;

import java.util.*;

public class PROG001 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
           StringBuilder answer= new StringBuilder();
           HashMap<String,Integer> map =new HashMap<>();
           for(String s : participant)map.put(s,map.getOrDefault(s,0)+1);
           for(String s : completion)map.put(s,map.getOrDefault(s,0)-1);

           for(String s:map.keySet()){
               if(map.get(s)!=0){
                   answer.append(s);
               }
           }


            return answer.toString();
        }
    }

    public boolean solution1(String[] pb) {
        boolean answer = true;
        Arrays.sort(pb);
        for(int i=0;i< pb.length-1;i++){
            if(pb[i].startsWith(pb[i+1]))
                return false;
        }

        return answer;


    }

//    int best=Integer.MAX_VALUE;
//    int [] dx ={-1,0,0,1};
//    int [] dy ={0,-1,1,0};
//    boolean [][] visit;

//    public int solution2(int[][] maps) {
//
//        visit=new boolean[maps.length][maps.length];
//        dfs(maps,0,0,1);
//        if(best==Integer.MAX_VALUE)best=-1;
//        int answer = best;
//        return answer;
//    }

//    public void dfs(int[][] maps,int x,int y,int cur){
//        System.out.println(x +" "+y +" "+ cur);
//        if(x== maps.length-1 && y== maps[0].length-1){
//            if(cur < best){
//                best= cur;
//                return;
//            }
//        }
//        for(int i=0;i<dx.length;i++){
//            int nx= x + dx[i];
//            int ny= y + dy[i];
//            if(nx < 0 || ny < 0 || nx>=maps.length || ny >= maps.length){
//                continue;
//            }
//            if(!visit[nx][ny] && maps[nx][ny] == 1){
//                visit[nx][ny] = true;
//                dfs(maps,nx,ny,cur+1);
//                visit[nx][ny]=false;
//            }
//        }
//    }
//    String[] str = {};
//    boolean[] visit;
//    ArrayList<String> list;
//    public String[] solution3(String[][] tickets) {
//        list= new ArrayList<>();
//        visit=new boolean[tickets.length];
//        //전처리
////        for(int i=0;i< tickets.length;i++){
////            if(tickets[i][0].equals("ICN"))start.add(i);
////        }
//        dfs(tickets,"ICN","ICN",0);
//        Collections.sort(list);
//
//        String[] answer = list.get(0).split(" ");
//
//        return answer;
//    }




//    public void dfs(String[][] tickets,String pre,String ans,int d){
//        if(d==tickets.length){
//            list.add(ans);
//        }
//        for(int i=0;i< tickets.length;i++){
//            if(!visit[i] && tickets[i][0].equals(pre)){//이부분 이 어렵다
//                visit[i]=true;
//                dfs(tickets,pre,tickets[i][1]+" "+tickets[i][1],d+1);
//                visit[i]=false;
//            }
//        }
//
//    }
    boolean[] visit;
    int count = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        visit = new boolean[words.length];
        return answer;

    }
    public void dfs(String begin,String target,String[] words,int d,int cnt){
        if(d == words.length && begin.equals(target)){
            if(cnt<count){
                count=cnt;
            }
        }
        for(int i=0;i< words.length;i++){
            if(diff(begin,words[i]) && !visit[i]){
                visit[i]=true;
                dfs(words[i],target,words,d+1,cnt+1);
                visit[i]=false;
            }
        }

    }
    public boolean diff(String begin,String str){
        int c=0;
        for(int i=0;i<begin.length();i++){
            if(begin.charAt(i)!=str.charAt(i))c++;
        }
        if(c==1){
            return true;
        }
        return false;
    }

    public String solution5(int[] numbers) {
        String [] str= new String[numbers.length];
        for(int i=0;i<str.length;i++)
        {
            str[i]=String.valueOf(numbers[i]);
        }
        String answer = "";
        return answer;
    }


    public static void main(String[] args) {
        PROG001 p = new PROG001();
//        int result=p.solution3();
//        System.out.println(result);
    }
}
