package urban.broccoli.leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * strs[i] consists of lowercase English letters.
 *
 * @author Ann Stesh
 */

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("result:" + groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {  //fast
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = new char[26]; // the eng alphabet consists of 26 letters
            for (char character : word.toCharArray()) {
                chars[character - 'a']++;
            }

            String keyStr = String.valueOf(chars);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagramsHashMap(String[] strs) {  //little memory
        List<List<String>> result = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();

        for (String word : strs) {
            HashMap<Character, Integer> lettersMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                lettersMap.put(word.charAt(i), lettersMap.getOrDefault(word.charAt(i), 0) + 1);
            }

            if (!map.containsKey(lettersMap)) {
                map.put(lettersMap, new ArrayList<>());
            }
            List<String> words = map.get(lettersMap);
            words.add(word);
            map.put(lettersMap, words);
        }

        result.addAll(map.values());
        return result;
    }
}
