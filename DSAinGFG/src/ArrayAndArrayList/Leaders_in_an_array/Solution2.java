package ArrayAndArrayList.Leaders_in_an_array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Methodology: [Expected Approach] Using Suffix Maximum
 * Author: Ahmed Hussein
 * * * Logic & Execution:
 * 1. Directional Shift: Instead of scanning from left to right, we scan from right to left (Backward Scanning).
 * 2. Efficiency: This approach avoids nested loops by maintaining a running maximum of all elements encountered so far.
 * 3. Tracking: A variable 'maxFromRight' is initialized with the last element. Since the last element has
 * no elements to its right, it is always a leader.
 * 4. Comparison: As we move left, if the current element is greater than or equal to 'maxFromRight',
 * it qualifies as a leader. We then update 'maxFromRight' to this new value.
 * 5. Reversal: Because we collect leaders starting from the end of the array, the 'leaders' list
 * is reversed at the end to restore the original relative order.
 * * * Performance Analysis:
 * - Time Complexity: O(n) - Linear time, as we traverse the array exactly once.
 * - Space Complexity: O(1) - Constant auxiliary space (ignoring the space for the output list).
 */

public class Solution2 {
    public static void main(String[] args) {

/**
 * Mechanism Description (Step-by-Step):
 * 1. Initial State: We start from the end of the array (index n-1) because
 * the last element has no elements to its right, making it a leader by default.
 * 2. Maximum Tracking (The "Shield"): We use the variable 'max' to keep track
 * of the largest element encountered so far from the right side.
 * 3. Linear Scan: We move backwards through the array. For each element:
 * - We compare the current element with 'max'.
 * - If (current >= max), it means this element is greater than all elements
 * to its right, so we identify it as a new leader.
 * 4. Update Strategy: When a new leader is found, we update 'max' to this new value
 * to challenge the next elements on the left.
 * 5. Restoration: Since leaders were found in reverse order (right-to-left),
 * we use Collections.reverse() to restore their original appearance order.
 */

        Integer[]arr={16, 17, 4, 3, 5, 2};
        ArrayList<Integer> original=new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer>leaders=new ArrayList<>();
        int max = original.get(original.size() - 1);

        for (int i=original.size()-1;i>=0;i--){
            if (max<=original.get(i)) {
                leaders.add(original.get(i));
                max=original.get(i);
            }
        }
        Collections.reverse(leaders);

        System.out.println(leaders);
    }
}
