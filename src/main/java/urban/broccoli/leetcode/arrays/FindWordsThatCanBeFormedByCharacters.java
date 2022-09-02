package urban.broccoli.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array of strings words and a string chars.
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 * Return the sum of lengths of all good strings in words.
 *
 * @author Ann Stesh
 */

public class FindWordsThatCanBeFormedByCharacters {
  
  public static void main(String[] args) {
    String[] words = {"cat", "bt", "hat", "tree"};
    String chars = "atach";
    
    System.out.println("result:" + countCharacters(words, chars));
  }
  
  private static int countCharacters(String[] words, String chars) {
    int result = 0;
    
    Map<Character, Integer> amountOfCharactersFromString = new HashMap<>();
    for (char letter : chars.toCharArray()) {
      amountOfCharactersFromString.put(letter, amountOfCharactersFromString.getOrDefault(letter, 0) + 1);
    }
    
    for (String word : words) {
      Map<Character, Integer> amountOfCharactersFromWord = new HashMap<>();
      
      char[] charArray = word.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
        char letter = charArray[i];
        if (amountOfCharactersFromString.get(letter) == null) break;
        amountOfCharactersFromWord.put(letter, amountOfCharactersFromWord.getOrDefault(letter, 0) + 1);
        if (amountOfCharactersFromWord.get(letter) > amountOfCharactersFromString.get(letter)) break;
        if (i == charArray.length - 1) result+=word.length();
      }
    }
    
    return result;
  }
  
}
