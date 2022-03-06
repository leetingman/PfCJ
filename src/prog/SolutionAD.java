package prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//programmers 81301  "숫자 문자열과 영단어"
public class SolutionAD {
    //solution 1 -->substring
    public int solution(String s) {
        int answer = 0;
        String[] strnum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strnum.length; i++) {
            //compare indexOf
            if (s.contains(strnum[i])) {
//                s.indexOf(st); word index position
//                s.indexOf(st+st.length()); word last index position
                int a = s.indexOf(strnum[i]);
                s = s.substring(0, a) + i + s.substring(a + strnum[i].length(), s.length());

            }

        }
        answer= Integer.parseInt(s);
        return answer;
    }

    //solution 2 replace
    public int solution1(String s) {

        String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
        String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        for (int i = 0 ; i <10 ; i++){
            s = s.replace(word[i] , num[i]);
        }
        return Integer.parseInt(s);
    }




    public static void main(String[] args) {
        String s= "2three45sixseven";
        SolutionAD sol=new SolutionAD();
        System.out.println(sol.solution(s));
    }

}
