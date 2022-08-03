package leetcode75.level1.day1;

import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] =
 * sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 * <p>
 * 1 <= nums.length <= 1000 -10^6 <= nums[i] <= 10^6
 */
public class RunningSum1dArray {

  public RunningSum1dArray() {
    // Example:
    // Input: nums = [1,1,1,1,1]
    // * Output: [1,2,3,4,5]
    // * Explanation: Running sum is obtained as follows:
    // [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
  }

  public static void main(String[] args) {
    RunningSum1dArray runningSum1dArray = new RunningSum1dArray();
    int[] nums = {1, 2, 3, 4};
    int[] result = runningSum1dArray.runningSum(nums);
    System.out.println("Result 1: " + Arrays.toString(result));

    int[] nums2 = {1, 1, 1, 1, 1};
    int[] result2 = runningSum1dArray.runningSum(nums2);
    System.out.println("Result 2: " + Arrays.toString(result2));

    int[] nums3 = {3, 1, 2, 10, 1};
    int[] result3 = runningSum1dArray.runningSum(nums3);
    System.out.println("Result 3: " + Arrays.toString(result3));
  }

  public int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    result[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      result[i] = result[i - 1] + nums[i];
    }
    return result;
  }
}
