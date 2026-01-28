package TheString.TheStringBuilderMethods;

public class StringBuilderAppend {

/**
 * Functionality:
 * Appends the string representation of the given data to the end of the
 * character sequence currently contained within the object.
 */
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder();
        /**
         * It reserves an initial memory buffer capable of holding 16 characters by default.
         * This is done to minimize the number of memory reallocations as the sequence grows.
         */
        System.out.println(str.capacity());
        /**
         * When the number of characters exceeds the current capacity,
         * the class automatically expands the capacity by allocating a new,
         * larger array. It then copies the original text to the new array
         * before appending the requested content.
         */
        str.append("hello this text to see the changing in capacity");
        System.out.println(str.capacity());

    }
}
