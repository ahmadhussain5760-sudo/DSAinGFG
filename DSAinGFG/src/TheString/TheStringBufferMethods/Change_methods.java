package TheString.TheStringBufferMethods;

public class Change_methods {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("i am learn java");

        /**
         * charAt(int index)
         * Functionality: Returns the character at a specific index.
         * Time Complexity: O(1)
         */

        System.out.println(str.charAt(2));//it will print 'a'
        char a=str.charAt(2);
        System.out.println(a);

        /**
         * setCharAt(int index,char)
         * Functionality: Replaces the character at the specified index with a new character.
         * Note: Unlike String, where you must create a new object,
         * StringBuffer performs this change in-place.
         * Time Complexity: O(1)
         */

        str.setCharAt(2,'w');
        System.out.println(str.charAt(2));//it will print 'w'

        /**
         * delete(start,end)
         * Functionality: Deletes a sequence of characters starting from 'start' index
         * up to (but not including) 'end' index.
         * Note: The character at the 'end' index is NOT removed.
         * Time Complexity: O(n)
         */
        str.delete(2,4);
        System.out.println(str);//it will print "i  learn java"

        /**
         * deleteCharAt(int index)
         * Functionality: Deletes a single character at a specific index.
         * Time Complexity: O(n)
         */
        str.deleteCharAt(5);
        System.out.println(str);//it will print "i learn java"

    }
}
