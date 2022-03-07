package prog;

public class SolutionAE {
    public int solution(int[] a,int [] b){
        int answer=1234567890;
        answer=0;
        for(int i=0;i<a.length;i++){
            answer=answer+a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        SolutionAE s=new SolutionAE();
        int[] a={1,2,3,4};
        int[] b={-3,-1,0,2};
        System.out.println(s.solution(a,b));
    }
}
