package TheAlgorithms.sorting.Non_comparision_based;

public class CountingSortV2 {

    public static int [] sort(int []arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] cntArr = new int[max + 1];

        for (int i = 0; i < arr.length; i++)
            cntArr[arr[i]]++;


        for (int i = 1; i < cntArr.length; i++)
            cntArr[i] = cntArr[i - 1] + cntArr[i];




        int[] ans=new int[arr.length];
        for (int i= arr.length-1;i>=0;i--){
            ans[cntArr[arr[i]]-1]=arr[i];
            cntArr[arr[i]]--;

        }

    return ans;


    }


    public static void main(String[] args) {
        int[] arr ={7,12,7,8,9};
      arr=sort(arr);
        for (int j : arr) System.out.println(j);
    }
}
