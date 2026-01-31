package TheTechniques.TwoPointers;

import java.util.Arrays;

public class Move_all_Zeros_to_End_of_Array {



    static int [] naive_method(int []arr){
        int[]temp=new int[arr.length];
        for (int i=0,j=0;i< arr.length;i++){
            if (arr[i]!=0) {
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
    }

static int [] better_method(int []arr){
       int j=0;
        for (int i=0;i< arr.length; i++){
         if (arr[i]!=0){
             arr[j]=arr[i];
             j++;
         }
        }

        while (j< arr.length){
            arr[j]=0;
            j++;
        }
        return arr;
}


static int [] expected_method(int []arr){
        int j=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
            }
        }
        return arr;
}


    public static void main(String[] args) {
        int[]arraywithzero={1,2,0,3,0,5,0,4,0,0,4,3};
        int []arrayTemp=new int[arraywithzero.length];
        arrayTemp=naive_method(arraywithzero);

        System.out.println(Arrays.toString(arrayTemp));

        System.out.println(Arrays.toString(naive_method(arraywithzero)));

        System.out.println(Arrays.toString(better_method(arraywithzero)));

        System.out.println(Arrays.toString(expected_method(arraywithzero)));
    }
}
