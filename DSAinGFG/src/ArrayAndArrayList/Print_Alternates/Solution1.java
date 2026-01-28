package ArrayAndArrayList.Print_Alternates;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem: Alternate elements of an array
 * * Description:
 * Given an array arr[], the task is to print every alternate element
 * of the array starting from the first element.
 * * Logic:
 * Traverse the array and print elements at even indices (0, 2, 4, ...).
 * * Examples:
 * Input: arr[] = [10, 20, 30, 40, 50]
 * Output: 10 30 50
 * * Author: Ahmed Hussein
 * Date: 2026-01-27
 */
public class Solution1 {
    public static void main(String[] args){
// --- Method 1: Iterative Approach (Index Jumping) ---
// Logic: Start from index 0, print the element, and jump by 2 (i += 2).
// This approach is efficient because it only visits the required elements.
        ArrayList<Integer> alternate=new ArrayList<>(5);

// Note: Using 'Integer[]' (Wrapper class) instead of 'int[]' (Primitive type)
// This is to simplify the conversion to ArrayList using 'Arrays.asList()',
// as Collections in Java only work with Objects, not primitives.
        Integer[] arr={10,20,30,40,50};
        alternate.addAll(Arrays.asList(arr));
        System.out.print("[");
        for (int i=0 ;i<alternate.size();i+=2){
            System.out.print(alternate.get(i));
            if (i==alternate.size()-1)
                continue;
            System.out.print(",");
        }
        System.out.println("]");



    }
}
