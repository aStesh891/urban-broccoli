package urban.broccoli.leetcode.strings;


/**
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 *
 * @author Ann Stesh
 */

public class ToLowerCase {
  
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println("result:" + toLowerCase(s));
  }
  
  public static String toLowerCase(String s) {
    StringBuilder lowerCase = new StringBuilder();
    
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        lowerCase.append((char) (s.charAt(i) + 32));
      } else {
        lowerCase.append(s.charAt(i));
      }
    }
    
    return lowerCase.toString();
  }
  
  private static String toLowerCaseEasy(String s) {
    return s.toLowerCase();
  }
}
