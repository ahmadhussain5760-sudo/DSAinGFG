package TheString.TheStringBufferMethods;
/**
 * Functionality:
 * Appends the string representation of the given data to the end of the
 * character sequence currently contained within the object.
 * length: The actual number of characters currently present in the sequence (the content size).
 * capacity: The total amount of storage available for newly inserted characters without resizing (the container size).
 *length<=capacity
 */




public class AppendAndLengthAndCapacityMethod {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer();
/**
 * It reserves an initial memory buffer capable of holding 16 characters by default.
 * This is done to minimize the number of memory reallocations as the sequence grows.
 */
        System.out.println(str.capacity());//16
        System.out.println(str.length());//0

/**
 * When the number of characters exceeds the current capacity,
 * the class automatically expands the capacity by allocating a new,
 * larger array. It then copies the original text to the new array
 * before appending the requested content.
 */
        str.append("hello this text to see the changing in capacity");
        System.out.println(str.capacity());
        System.out.println(str.length());
    }
}
