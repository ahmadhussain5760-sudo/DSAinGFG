package TheAlgorithms.sorting.Non_comparision_based;

public class RadixSort {
public static int getMax(int []arr){
    int max=arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (max < arr[i]) {
            max=arr[i];
        }
    }
    return max;
}


static void count(int []arr,int exp){
    int [] output=new int[arr.length];
    int []count=new int[10];


    for (int i = 0; i < arr.length; i++) {
        count[(arr[i]/exp)%10]++;
    }

    for (int i = 1; i < count.length; i++) {
        count[i] += count[i - 1];
    }
    for (int i = arr.length-1; i>=0; i--) {
        output[count[(arr[i]/exp)%10]-1]=arr[i];
        count[(arr[i]/exp)%10]--;
    }

    for (int i = 0; i < arr.length; i++)
        arr[i] = output[i];



}

static void radix(int[] arr){
    int m =getMax(arr);

    for (int exp=1;m/exp>0;exp*=10)
        count(arr,exp);
}

    public static void main(String[] args) {

        int[] arr ={7,12,7,8,9};
        radix(arr);
        for (int j : arr) System.out.println(j);
    }
}
