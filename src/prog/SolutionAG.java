package prog;
//kakao BLIND 2019 오픈채팅방 lv2


import java.util.*;

public class SolutionAG {

    // time over
    public String[] solution(String[] record){
        String[] answer={};
        Map<String,String> map;
        Map<String,String> nickMap=new HashMap<>();
        ArrayList<Map> list =new ArrayList<>();
        StringTokenizer st;

        for(String str:record){
            st=new StringTokenizer(str);
            String act=st.nextToken();
            String uid=st.nextToken();
            map=new HashMap<>();
            if(act.equals("Enter")){
                map.put(act,uid);
                nickMap.put(uid,st.nextToken());
                list.add(map);
            }else if(act.equals("Leave")){
                map.put(act,uid);
                list.add(map);
            }else{
                nickMap.put(uid,st.nextToken());
            }


        }
        Iterator <String>test =nickMap.keySet().iterator();
//        while(test.hasNext()){
//            String a=test.next();
//            System.out.println(a+nickMap.get(a));
//        }
        answer=new String[list.size()];
        for(int i=0;i<list.size();i++){
            Iterator<String> keys=list.get(i).keySet().iterator();
            String key=keys.next();
            if(key.equals("Enter")) {
                answer[i] = nickMap.get(list.get(i).get(key)) + "님이 들어왔습니다.";
            }else{
                answer[i] = nickMap.get(list.get(i).get(key))  + "님이 나갔습니다.";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        SolutionAG s =new SolutionAG();
        String[] answer=s.solution(record);
        for(String st:answer){
            System.out.println(st);
        }

    }
}
