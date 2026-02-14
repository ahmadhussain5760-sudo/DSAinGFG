package TheAlgorithms.sorting.comparision_based;

public class Bubble_sort {
    static int [] bubbleSort(int[] arr){
        int temp;
        boolean stoppedSwap;
        for (int i=0;i< arr.length;i++){
            stoppedSwap =false;
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    stoppedSwap=true;
                }
            }
            if (!stoppedSwap)
                break;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr ={5,6,1,3};
        bubbleSort(arr);
        for (int j : arr) System.out.println(j);
    }
}
