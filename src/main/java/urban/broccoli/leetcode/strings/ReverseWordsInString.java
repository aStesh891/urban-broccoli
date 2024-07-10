package urban.broccoli.leetcode.strings;

/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words.
 * Do not include any extra spaces.
 * <p>
 * Example:
 * Input: s = "  hello world  "
 * Output: "world hello"
 *
 * @author Ann Stesh
 */

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println("result:" + reverseWords(s));
    }

    //Time and space complexity: O(N)
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        String[] words = s.trim().split("\\s+"); // "\s+" matches one or more whitespace characters

        int length = words.length;

        for (int i = 0; i < length; i++) {

            if (!words[i].isEmpty() && !words[i].equals(" ")) {
                result.append(words[length - 1 - i]);

                if (i < length - 1) result.append(" ");
            }
        }

        return result.toString();
    }
}