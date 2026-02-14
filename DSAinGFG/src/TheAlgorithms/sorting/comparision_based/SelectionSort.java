package TheAlgorithms.sorting.comparision_based;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for (int i=0 ;i< arr.length;i++){
            int min=arr[i];
            int minIndex=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            arr[minIndex]=arr[i];
            arr[i]=min;

        }
    }

    public static void main(String[] args) {
        int[] arr ={7,12,8,9};
        selectionSort(arr);
        for (int j : arr) System.out.println(j);
    }

}
