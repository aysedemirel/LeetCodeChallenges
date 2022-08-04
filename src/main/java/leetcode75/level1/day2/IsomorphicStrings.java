package leetcode75.level1.day2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order
 * of characters. No two characters may map to the same character, but a character may map to
 * itself.
 * <p>
 * 1 <= s.length <= 5 * 104
 * <p>
 * t.length == s.length
 * <p>
 * s and t consist of any valid ascii character.
 */
public class IsomorphicStrings {

  public IsomorphicStrings() {
    // Input: s = "paper", t = "title"
    // Output: true
  }

  public static void main(String[] args) {
    IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
    System.out.println("Result 1: " + isomorphicStrings.isIsomorphic("paper", "title"));
    System.out.println("Result 2: " + isomorphicStrings.isIsomorphic("foo", "bar"));
  }

  private String transformString(String s) {
    Map<Character, Integer> indexMapping = new HashMap<>();
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i);
      if (!indexMapping.containsKey(c1)) {
        indexMapping.put(c1, i);
      }
      builder.append(indexMapping.get(c1));
      builder.append(" ");
    }
    return builder.toString();
  }

  public boolean isIsomorphic(String s, String t) {
    return transformString(s).equals(transformString(t));
  }
}
