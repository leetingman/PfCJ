package prog;

//programmers Summer/Winter Coding(2019) 멀쩡한 사각형
// H,W  s=H/W   getcha crossed line of y=sx
// 약수 구해서 최소 비율 구함
//y = sx 0<=y<h 0<=x<w
//if triangle bigger then 0  then is empty;

public class SolutionAI {
    public long solution(int w,int h) {
        long answer = 0;
        for(int i = 0; i < w; i++)
            answer += (Long.valueOf(h) * i) / Long.valueOf(w);

        return answer * 2;
    }
    public static void main(String[] args) {
        SolutionAI s= new SolutionAI();
        System.out.println(s.solution(8,12));
    }
}
