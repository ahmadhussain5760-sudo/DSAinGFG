package TheString.TheStringBuilderMethods;

public class StringBuilderReplace {
/**
 * replace() method:
 * - Allows replacing a group of characters within a specific range with a new string.
 * - Parameters:
 * 1. start: index for the beginning of the replacement.
 * 2. end: index for the end of the replacement.
 * 3. str: the new string that will be placed in this range.
 * * - Implementation (What happens when the method is called):
 * 1. Verification: It checks that 'start' is not negative, is within the string length,
 * and is less than or equal to 'end'. Any violation of these conditions
 * throws a (StringIndexOutOfBoundsException).
 * 2. If the new string is longer than the text to be replaced, StringBuilder
 * automatically increases the internal array size to accommodate the new data.
 * 3. Shifting: The remaining characters are shifted to the right or left
 * to create the exact space needed for the new string.
 * 4. The contents of the string 'str' are then copied into the specified location.
 */
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder(5);
str.append("my name is ahmad and i study dsa");
        System.out.println(str);
str.replace(11,17,"mohamed ");
        System.out.println(str);
str.replace(31,33,"data base");
        System.out.println(str);
    }
}
