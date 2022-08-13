package leetcode75.level1.day5;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the
 * longest palindrome that can be built with those letters.
 * <p>
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {

  public LongestPalindrome() {
    // Input: s = "abccccdd"
    //Output: 7
    //Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
  }

  public static void main(String[] args) {
    LongestPalindrome longestPalindrome = new LongestPalindrome();
    System.out.println("Result 1: " + longestPalindrome.longestPalindrome("zabccccdd"));
    System.out.println("Result 2: " + longestPalindrome.longestPalindrome("a"));
    System.out.println("Result 3: " + longestPalindrome.longestPalindrome("bb"));
    System.out.println("Result 4: " + longestPalindrome.longestPalindrome("ccc"));
  }

  public int longestPalindrome(String s) {
    char[] ch = s.toCharArray();
    Arrays.sort(ch);
    Stack<Character> stack = new Stack<>();
    stack.push(ch[0]);
    for (int i = 1; i < s.length(); i++) {
      if (stack.size() != 0 && stack.peek() == ch[i]) {
        stack.pop();
      } else {
        stack.push(ch[i]);
      }
    }
    int longest = s.length() - stack.size();
    if (stack.size() >= 1) {
      longest++;
    }
    return longest;
  }
}
