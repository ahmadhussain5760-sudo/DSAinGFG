package TheTechniques.SlidingWindow;

public class Smallest_window {

    static int smallest_window (int arr[]){
        int min=Integer.MAX_VALUE;
        int last0=-1, last1=-1,last2=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                last0=i;
            } else if (arr[i]==1) {
                last1=i;
            } else if (arr[i]==2) {
                last2=i;
            }

                if (last0 != -1 &&last1!= -1 &&last2!= -1 ) {
                    if (min > i-Math.min(last0,Math.min(last1,last2))+1) {
                        min=i-Math.min(last0,Math.min(last1,last2))+1;
                    }
                }

        }
if (last0==-1||last1==-1||last2==-1)
    return -1;
else
    return min;
    }



    static int smallest_window_sl(int arr[]){
       int min =Integer.MAX_VALUE;
       int count0=0,count1=0,count2=0;
       int left=0 ,right=0;

        while (right< arr.length){
            if (arr[right]==0){
                count0++;}
            else if (arr[right]==1) {
                count1++;
            } else if (arr[right]==2) {
                count2++;
            }
            while (count0>0&&count1>0&&count2>0){
                min=Math.min(min,right-left+1);
                    if (arr[left]==0){
                        count0--;}
                    else if (arr[left]==1) {
                        count1--;
                    } else if (arr[left]==2) {
                        count2--;
                    }

                left++;


            }

            right++;
        }
        if (min==Integer.MAX_VALUE)
            return -1;
        else
            return min;
    }



    public static void main(String[] args) {

    }
}
