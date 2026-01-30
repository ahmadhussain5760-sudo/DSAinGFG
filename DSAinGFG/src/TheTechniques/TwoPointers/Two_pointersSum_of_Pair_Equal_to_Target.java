package TheTechniques.TwoPointers;
/**
 * In this problem, we are required to find two elements in an array whose sum
 * equals a specific number called the "target". We will solve this problem
 * using several methods and explain each one of them.
 */
public class Two_pointersSum_of_Pair_Equal_to_Target {
/**
 * We will now use the first and naive method to accomplish the task.
 * This approach utilizes two nested loops: the first loop picks an element,
 * and the second loop compares it with the remaining elements to find a match.
 *  Time Complexity: O(n²)
 *  Space Complexity: O(1)
 */
static boolean NaiveMethod(int [] arr,int target){
    for (int i=0 ;i<arr.length;i++)
        // We start j from i + 1 to:
        // 1. Avoid adding an element to itself.
        // 2. Ensure each unique pair is checked only once, reducing redundant operations.
        for (int j=i+1;j<arr.length;j++){
            if (arr[i]+arr[j]==target)
                return true;
        }
    return false;
}

/**
 * Approach 2: Optimized Two-Pointer Technique
 * * In this second approach, we implement the Two-Pointers strategy to significantly
 * improve efficiency by reducing the time complexity to O(n).
 * * Mechanism:
 * 1. Initialize one pointer at the first element (left) and another at the last element (right).
 * 2. If their sum is greater than the target, we shift the 'right' pointer to the left
 * to decrease the total sum.
 * 3. If their sum is smaller than the target, we shift the 'left' pointer to the right
 * to increase the total sum.
 */
static boolean two_pointer(int []arr,int target){
    int left=0,right= arr.length-1;
    while (left<right){
        // Store the sum in a variable to avoid redundant calculations in the if-else conditions
        int sum=arr[left]+arr[right];
        if (sum>target)
            right--;// Decrease sum by moving the right pointer inward
        else if (sum<target)
            left++;// Increase sum by moving the left pointer inward
        else
            return true;//we found the target
    }
    return false;//we don't found the target
}




    public static void main(String[] args) {
    //we will create an array to test the last methods
    int arrayTest[]={10,20,30,40,50};
//we will call the naive method
        if (NaiveMethod(arrayTest,40))
            System.out.println("the naive method found two number give the target");
        else
            System.out.println("the naive method don't found two number give the target");

//we will call the two pointer method
        if (two_pointer(arrayTest,40))
            System.out.println("the two_pointer method found two number give the target");
        else
            System.out.println("the two_pointer method don't found two number give the target");
    }
}
