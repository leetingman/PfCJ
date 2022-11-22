package prog;

public class PROG007 {


    public String solution(int[] food) {
        String answer = "";
        StringBuffer sb= new StringBuffer();

        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                sb.append(i);
            }
        }
        answer=sb.toString()+"0"+sb.reverse().toString();
        return answer;
    }



}
