package TheAlgorithms.sorting.comparision_based;

public class InsertionSort {
    static int [] insertionSort(int []arr){
        int key;
        for (int i=1;i< arr.length;i++){
            int j=i-1;
            key=arr[i];
            while (j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                for (int l : arr) System.out.print(l);
                System.out.println();
                j=j-1;
            }
            arr[j+1]=key;
            for (int l  : arr) System.out.print(l);
            System.out.println();

        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr ={7,12,8,9};
        insertionSort(arr);
        for (int j : arr) System.out.println(j);
    }
}
