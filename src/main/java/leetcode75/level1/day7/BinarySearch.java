package leetcode75.level1.day7;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write
 * a function to search target in nums. If target exists, then return its index. Otherwise, return
 * -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {

  public BinarySearch() {
    // Input: nums = [-1,0,3,5,9,12], target = 9
    // Output: 4
    // Explanation: 9 exists in nums and its index is 4
  }

  public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
    int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
    System.out.println("RESULT 1: " + binarySearch.search(nums, 13));
//    System.out.println("RESULT 2: " + binarySearch.search(nums, 2));
  }

  public int search(int[] nums, int target) {
    return search(nums, target, 0, nums.length - 1);
  }

  public int search(int[] nums, int target, int start, int end) {
    if (nums.length == 0 || end < start || start > end) {
      return -1;
    }
    if (start == end || nums.length == 1) {
      if (nums[start] != target) {
        return -1;
      } else {
        return start;
      }
    }
    int mid = (start + end) / 2;
    if (target == nums[mid]) {
      return mid;
    } else if (target > nums[mid]) {
      return search(nums, target, mid + 1, end);
    } else if (target < nums[mid]) {
      return search(nums, target, start, mid - 1);
    }
    return -1;
  }

}
