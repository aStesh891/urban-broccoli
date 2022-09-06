package urban.broccoli.leetcode.strings;


/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 * @author Ann Stesh
 */

public class LengthOfLastWord {
  
  public static void main(String[] args) {
    String s = "   fly me   to   the moon  ";
    System.out.println("result:" + lengthOfLastWord(s));
  }
  
  public static int lengthOfLastWord(String s) {
    String[] words = s.split(" ");
    return words[words.length - 1].length();
  }
  
  public static int lengthOfLastWordFast(String s) {
    int lengthOfWord = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) != ' ') {
        lengthOfWord++;
      } else if (lengthOfWord > 0)
        return lengthOfWord;
    }
    return lengthOfWord;
  }
}
