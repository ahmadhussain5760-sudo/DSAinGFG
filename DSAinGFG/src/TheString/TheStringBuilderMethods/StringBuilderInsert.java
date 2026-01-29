package TheString.TheStringBuilderMethods;

public class StringBuilderInsert {

/**
 * 1) insert method in StringBuilder:
 * * This operation inserts a new text into a specified location,
 * which forces the existing characters to shift from their positions
 * to make space for the incoming text.
 * * What happens in memory when calling insert:
 * 1. Locate the position: The processor goes to the specified index.
 * 2. Shifting: This is the most important step, where elements starting
 * from the index are pushed or shifted to the right by the number
 * of characters in the new text.
 * * Time Complexity: O(n); because if the index is 0, we will be forced
 * to move all array elements one or more steps to the right.
 * * Space Complexity: O(1) if there is enough capacity,
 * or O(n) if resizing is required.
 * * Restrictions:
 * - Insertion in a negative index is prohibited.
 * - Insertion in an index outside the array boundaries is not possible.
 */
    public static void main(String[] args) {
        /*
        ***here we have an example .
        ***we created a string by string builder and give it 5 capacity  .
        ***we add "ahmad".
        ***we insert "hussain" at the ind.
        ***we insert "i am" at the front .
         */

        StringBuilder str =new StringBuilder(5);
        str.append("ahmad");
        str.insert(5," hussain");
        System.out.println(str);
        str.insert(0,"i am ");
        System.out.println(str);


    }
}
