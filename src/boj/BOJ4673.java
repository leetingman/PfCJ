package boj;


//easy peasy japanese
public class BOJ4673 {
    public boolean[] d(boolean[] arr,int n){
        arr[n]=true;
        return arr;
    }

    public static void main(String[] args) {
        BOJ4673 m=new BOJ4673();
        boolean[] arr =new boolean[10000];//init value false

        for(int i=1;i<=arr.length;i++){
            int selfnum =0;
            int num=i;
            while(true){

                selfnum+= num%10;
                num=num/10;
                if(num==0)break;
            }
            selfnum+=i;
            if(selfnum-1<arr.length) {
                arr=m.d(arr, selfnum - 1);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=true){
                System.out.println(i+1);
            }
        }
    }

}
