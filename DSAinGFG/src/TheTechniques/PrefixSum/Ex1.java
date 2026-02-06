package TheTechniques.PrefixSum;

public class Ex1 {
    static int[] p (int []arr){
        int []p1=new int[arr.length];
        for (int i=0;i< arr.length;i++){
            if (i==0)
                p1[i]=arr[i];
            else if (i>0) {
                p1[i]=p1[i-1]+arr[i];
            }
        }
        return p1;
    }


    public static void main(String[] args) {

    }
}
