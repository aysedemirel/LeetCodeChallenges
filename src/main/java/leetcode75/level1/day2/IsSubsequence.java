package leetcode75.level1.day2;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting
 * some (can be none) of the characters without disturbing the relative positions of the remaining
 * characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * 0 <= s.length <= 100
 * <p>
 * 0 <= t.length <= 104
 * <p>
 * s and t consist only of lowercase English letters.
 */
public class IsSubsequence {

  public IsSubsequence() {
    // Input: s = "abc", t = "ahbgdc"
    // Output: true
  }

  public static void main(String[] args) {
    IsSubsequence isSubsequence = new IsSubsequence();
    System.out.println("Result 1: " + isSubsequence.isSubsequence("abc", "ahbgdc"));
    System.out.println("Result 2: " + isSubsequence.isSubsequence("axc", "ahbgdc"));
  }

  public boolean isSubsequence(String s, String t) {
    if (s.length() == 0) {
      return true;
    }
    StringBuilder bl = new StringBuilder(s);
    for (int i = 0; i < t.length() && bl.length() != 0; i++) {
      char ch = t.charAt(i);
      if (ch == bl.charAt(0)) {
        bl.deleteCharAt(0);
      }
    }
    return bl.length() == 0;
  }
}
