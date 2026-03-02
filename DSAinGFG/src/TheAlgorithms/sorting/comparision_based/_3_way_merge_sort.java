package TheAlgorithms.sorting.comparision_based;

public class _3_way_merge_sort {


    static void split(int[] arr,int high,int low){
        if (low>=high)
            return;
        int mid1 = low + (high - low) / 3;
        int mid2 = low + 2 * (high - low) / 3 + 1 ;


        split(arr, mid1, low);
        split(arr, mid2, mid1+1);
        split(arr, high, mid2+1);

        merge(arr, high,low,mid1,mid2);
    }





    static void merge(int []arr,int high,int low,int mid1,int mid2){
        int[] split1=new int[mid1-low+1];
        int[] split2=new int[mid2-mid1];
        int[] split3=new int[high-mid2];


        for (int i = 0; i < split1.length; i++) split1[i] = arr[low + i];
        for (int j = 0; j < split2.length; j++) split2[j] = arr[mid1+1  + j];
        for (int l = 0; l < split3.length; l++) split3[l] = arr[mid2+1  + l];



        int i=0,j=0,l=0,k=low;


        while (i<split1.length&&j<split2.length&&l<split3.length) {
            if (split1[i]<=split2[j]&&split1[i]<=split3[l]){
                arr[k]=split1[i];
                i++;
                k++;
            } else if (split2[j]<=split1[i]&&split2[j]<=split3[l]) {
                arr[k]=split2[j];
                j++;
                k++;
            } else if (split3[l]<=split1[i]&&split3[l]<=split2[j]) {
                arr[k]=split3[l];
                l++;
                k++;
            }
        }


      //i=length-1
            while (j< split2.length&&l< split3.length){
                if (split2[j]>=split3[l]){
                    arr[k]=split3[l];
                    k++;l++;
                }
                else {
                    arr[k]=split2[j];
                    k++;j++;}

            }







            while (i< split1.length&&l< split3.length){
                if (split1[i]>=split3[l]){
                    arr[k]=split3[l];
                    k++;l++;
                }
                else {
                    arr[k]=split1[i];
                    k++;i++;}


            }







            while (j< split2.length&&i< split1.length){
                if (split2[j]>=split1[i]){
                    arr[k]=split1[i];
                    k++;i++;
                }
                else {
                    arr[k]=split2[j];
                    k++;j++;}

            }

            while (i< split1.length){
                arr[k]=split1[i];
                i++;k++;
            }
             while (j< split2.length){
            arr[k]=split2[j];
               j++;k++;
             }
             while (l< split3.length){
            arr[k]=split3[l];
            l++;k++;
              }

    }

    static void printArr(int []arr){
        for (int i:arr) System.out.print(i+"  ");

        System.out.println();
    }

    public static void main(String[] args) {
        int []arr={1,5,3,4,8,7,3,9,2,5};
        int[] arr1 = {0, -5, 3, 3, -1, 0, 7, -5, 2, 4};
        printArr(arr1);
        split(arr1, arr1.length-1, 0);
        System.out.println();
        printArr(arr1);
    }

}
