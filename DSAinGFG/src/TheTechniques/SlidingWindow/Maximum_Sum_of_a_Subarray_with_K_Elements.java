package TheTechniques.SlidingWindow;



public class Maximum_Sum_of_a_Subarray_with_K_Elements {
    static int maxByNaive(int[]arr,int k){
        if (k> arr.length)
            return 0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<=arr.length-k;i++){
            int sum=0;
            for (int j=i;j<(i+k);j++){
                sum+=arr[j];
            }
            if (max< sum) {
                max=sum;
            }
        }
        return max;
    }


    static int maxBySlidingWindow(int []arr,int k){
        if (k > arr.length) {
            System.out.println("error in k");
            return -1;
        }
        int sum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }

        int max =sum;

        for (int j=k;j< arr.length;j++){
             sum=sum-arr[j-k]+arr[j];
            max=Math.max(max,sum);
        }
        return max;
    }




    public static void main(String[] args) {


    }
}
