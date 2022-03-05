/*
package prog;

import java.util.*;

public class SolutionAC {
    public int[] solution(String[] id_list, String[] report, int k) {
//        id_list 이용자의 id 를 나타내는 문자열
//        report 이용자id 신고한id  ex "muzi fredo" "muze" report "frodo"
         */
/*
         report 중복값제거 =>    report -> Hashset v
         1. report 분리 필요  reporter(value)와  reported(key) ,Map<String, ArrayList<String>>으로 reporter 츄
         2. int[] answer = new int[id_list.length] 초기화
         3. reported의 value값.size가 > k 인 값
        *//*

        int[] answer = new int[id_list.length];
        HashSet<String> reportSet=new HashSet<>();

        for(String set:report)reportSet.add(set);

        Iterator iter= reportSet.iterator();
//        HashMap<String,ArrayList<String>> reportMap=new HashMap<>();
//        HashMap<String,HashSet<String>> reportMap=new HashMap<>(); list 에서 초기괎 설정 으로 인해 nullpointerExceotion 발생
        HashMap<String,Integer> resultMap=new HashMap<>();

        //Initialization reportMap
        for(String id:id_list)reportMap.put(id,new HashSet<>());

        while(iter.hasNext()){
            String[] repo=
            iter.next().toString().split(" ");
            reportMap.get(repo[1]).add(repo[0]);
        }

        for(String id:reportMap.keySet()){
            HashSet<String> list=reportMap.get(id);
            if(list.size()>=k){
                for(String repo:list){
                    int count=resultMap.get(repo);
                    resultMap.put(repo,count++);
                }
            }
        }

        for(int i=0;i<answer.length;i++){
            answer[i]=resultMap.get(id_list[i]);
        }





        return answer;


    }

    public static void main(String[] args) {
        SolutionAC s=new SolutionAC();
        String[]
        id_list={"muzi", "frodo", "apeach", "neo"};
        String[] report= {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        s.solution(id_list,report,2);
    }

}
*/
