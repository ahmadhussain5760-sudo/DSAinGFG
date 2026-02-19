package TheAlgorithms.sorting.comparision_based;

public class CycleSort {
    static void cycle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            int pos = i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < item)
                    pos++;
            }
            if (pos==i)continue;
            while (item==arr[pos])pos++;
            int temp = arr[pos];
            arr[pos] = item;
            item = temp;


            while (pos != i) {
                pos=i;
                for (int j = i+1; j < arr.length; j++) {

                    if (arr[j] < item)
                        pos++;
                }

                while (item==arr[pos])pos++;
                temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }

        }

    }


    static void printArr(int[] arr) {
        for (int i : arr) System.out.print(i + "  ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 8, 7, 3, 9, 2, 5};
        printArr(arr);
        cycle(arr);
        System.out.println();

        printArr(arr);


    }

}
