package TheAlgorithms.sorting.Non_comparision_based;

public class CountingSort {


    static void countingSort(int[] arr){
        int max=arr[0];
        for (int j=1;j< arr.length;j++){
            if (arr[j]>max)
                max=arr[j];
        }

    int []arrS=new int[max+1];
    for (int i=0;i< arr.length;i++){
        arrS[arr[i]]++;
    }
int indexOfArray=0;
    for (int z=0;z< arrS.length;z++){
        while (arrS[z]>0){
            arr[indexOfArray]=z;
            arrS[z]--;
            indexOfArray++;
        }

            }
    }


    public static void main(String[] args) {
        int[] arr ={7,12,7,8,9};
        countingSort(arr);
        for (int j : arr) System.out.println(j);
    }
    }

