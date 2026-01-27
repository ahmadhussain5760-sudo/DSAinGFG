package ArrayAndArrayList.problem1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Methodology: Recursive Approach
 * Author: Ahmed Hussein
 * * Logic:
 * The idea is to use recursion to traverse the array. Starting from index 0,
 * the function prints the current element and then makes a recursive call
 * to itself with the next target index (index + 2).
 * * Key Components:
 * - Base Case: Stops execution when the index is out of array bounds.
 * - Recursive Step: Processes the current element and jumps by 2 for the next call.
 */
public class Solution2 {

    static void getAlternatesRecursive(ArrayList<Integer> original,int index,ArrayList<Integer> result){
        if (index<original.size()){
            result.add(original.get(index));
            getAlternatesRecursive(original,index+2,result);
        }

    }


    public static void main(String[] args){
    ArrayList<Integer>res=new ArrayList<>(5);
    ArrayList<Integer>newArr=new ArrayList<>();
    Integer[]arr={10,20,30,40,50};
    res.addAll(Arrays.asList(arr));
    getAlternatesRecursive(res,0,newArr);
        System.out.println(newArr);

    }
}
