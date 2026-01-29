package ArrayAndArrayList.Leaders_in_an_array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem: Leaders in an Array
 * * Description:
 * An element is considered a "Leader" if it is greater than all the elements
 * to its right side. The rightmost element is always a leader.
 * * Example:
 * Input: arr = [16, 17, 4, 3, 5, 2]
 * Output: [17, 5, 2]
 * * This file implements the [Naive Approach] using nested loops.
 */
public class Solution1 {
    public static void main(String[] args){

/**
 * Methodology: [Naive Approach] Using Nested Loops
 * Author: Ahmed Hussein
 * * * Logic & Execution:
 * 1. Initial State: The code starts by picking an element at index 'i' from the 'original' ArrayList.
 * 2. Reset Mechanism: For every new 'i', a boolean flag 'a' is set to true, assuming the element is a leader.
 * 3. Right-Side Validation: A second loop (j) scans all elements from index 'i+1' to the end.
 * 4. Condition & Optimization: If any element at index 'j' is strictly greater than the element at 'i',
 * the flag 'a' is flipped to false. A 'break' is used here to terminate the inner loop immediately
 * once a larger element is found, avoiding redundant comparisons.
 * 5. Collection: Once the inner loop completes, if the flag 'a' remained true,
 * the element is identified as a leader and added to the 'leaders' list.
 * * * Performance Analysis:
 * - Time Complexity: O(n²) - In the worst case, every element is compared with all subsequent elements.
 * - Space Complexity: O(n) - A separate ArrayList is used to store the results.
 */


        Integer[]arr={16, 17, 4, 3, 5, 2};
        ArrayList<Integer>original=new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer>leaders=new ArrayList<>();


        for (int i=0;i<original.size();i++){
            boolean a=true;
            for (int j=i+1;j<original.size();j++) {
                if (original.get(i) < original.get(j)) {
                    a = false;
                    break;
                }
            }
            if (a)
                leaders.add(original.get(i));
            }
        System.out.println(leaders);

    }
}
