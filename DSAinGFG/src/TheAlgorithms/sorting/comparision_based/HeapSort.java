package TheAlgorithms.sorting.comparision_based;

public class HeapSort {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printArr(int[] arr) {
        for (int i : arr) System.out.print(i + "  ");

        System.out.println();
    }

    static void heapify(int [] arr,int n,int i){
        int largest=i;
        int l=2*i+1,r=2*i+2;
        if (r<n&&arr[r]>arr[largest])
            largest=r;
        if (l<n&&arr[l]>arr[largest])
            largest=l;
        if (largest!=i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
static void sort(int []arr){
        int n= arr.length;
        for (int i=n/2-1;i>=0;i--)
            heapify(arr,n,i);

        for (int i=n-1;i>=0;i--){
            swap(arr,i,0);
            heapify(arr,i,0);
        }

  }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 8, 7, 3, 9, 2, 5};
        printArr(arr);
        sort(arr);
        System.out.println();

        printArr(arr);
    }
}