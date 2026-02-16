package TheAlgorithms.sorting.comparision_based;

public class MergeSort {
    static void printArr(int []arr){
        for (int i:arr) System.out.print(i+"  ");

        System.out.println();
    }

    static void mergeSort(int[]arr,int start,int end){
        if (start>=end  )
            return;
        int mid=start+( (end -start) /2  );

        mergeSort(arr,start,mid);//the left
        mergeSort(arr,mid+1,end);//the right
        merge(arr,start,end,mid);

    }




    static void merge(int []arr,int start,int end,int mid){
        int []left=new int[mid-start+1];
        int[]right=new  int[end -mid];

        for (int i=0;i< left.length;i++) {
        left[i]=arr[start+i];
        }
        for (int i=0;i< right.length;i++){
            right[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=start;
        while (i< left.length&&j< right.length){
            if (left[i]<right[j]) {
                arr[k] = left[i];
                k++;i++;
            }
            else {
                arr[k]=right[j];
                k++;j++;
            }
        }
        if (i>= left.length)
            for (int z=j;z<right.length;z++){
                arr[k]=right[z];
                k++;
            }
        else if (j>= right.length)
            for (int z=i;z<left.length;z++){
                arr[k]=left[z];
                k++;
            }

    }


    public static void main(String[] args) {
        int []arr={1,5,3,4,8,7,3,9,2,5};
        printArr(arr);
        mergeSort(arr,0, arr.length-1);
        System.out.println();

        printArr(arr);
    }
}
