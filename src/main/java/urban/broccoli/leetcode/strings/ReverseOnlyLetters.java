package urban.broccoli.leetcode.strings;

/**
 * Given a string s, reverse the string according to the following rules:
 * <p>
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 *
 * @author Ann Stesh
 */

public class ReverseOnlyLetters {
  
  public static void main(String[] args) {
    String s = "a-bC-dEf-ghIj";
    System.out.println("result:" + reverseOnlyLetters(s));
  }
  
  public static String reverseOnlyLetters(String s) {
    int start = 0;
    int end = s.length() - 1;
    
    char[] chars = s.toCharArray();
    
    while (start < end) {
      if (Character.isLetter(chars[start]) && Character.isLetter(chars[end])) {
        char swap = chars[start];
        chars[start] = chars[end];
        chars[end] = swap;
        start++;
        end--;
      } else if (!Character.isLetter(chars[start])) {
        start++;
      } else {
        end--;
      }
    }
    
    return new String(chars);
  }
}
