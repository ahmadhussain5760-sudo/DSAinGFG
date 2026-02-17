package TheAlgorithms.sorting.comparision_based;

public class QuickSort {

    static void printArr(int[] arr) {
        for (int i : arr) System.out.print(i + "  ");

        System.out.println();
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int start, int end) {


        int pivot = arr[end], j = start, i = start - 1;
        while (j < end) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, j, i);

            }
            j++;
        }
        swap(arr, end, i + 1);

        return i + 1;
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int siteOfPivot = partition(arr, start, end);
        quickSort(arr, start, siteOfPivot - 1);
        quickSort(arr, siteOfPivot + 1, end);
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 8, 7, 3, 9, 2, 5};
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println();

        printArr(arr);
    }
}


