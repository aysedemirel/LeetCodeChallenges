package leetcode75.level1.day7;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately,
 * the latest version of your product fails the quality check. Since each version is developed based
 * on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
 * causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a
 * function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {

  private final static int BAD_VERSION = 662351799;

  public FirstBadVersion() {
    //Input: n = 5, bad = 4
    //Output: 4
    //Explanation:
    //call isBadVersion(3) -> false
    //call isBadVersion(5) -> true
    //call isBadVersion(4) -> true
    //Then 4 is the first bad version.
  }

  public static void main(String[] args) {
    FirstBadVersion firstBadVersion = new FirstBadVersion();
    System.out.println("RESULT: " + firstBadVersion.firstBadVersion(1182691386));
  }

  boolean isBadVersion(int version) {
    return version == BAD_VERSION;
  }

  public int firstBadVersion(int totalVersion) {
    int start = 1;
    int end = totalVersion;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (isBadVersion(mid)) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }


}
