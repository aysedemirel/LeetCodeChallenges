package leetcode75.level1.day1;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index
 * is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no
 * elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 * <p>
 * 1 <= nums.length <= 104,  -1000 <= nums[i] <= 1000
 */
public class FindPivotIndex {

  public FindPivotIndex() {
    //Input: nums = [1,7,3,6,5,6]
    //Output: 3
    //Explanation:
    //The pivot index is 3.
    //Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
    //Right sum = nums[4] + nums[5] = 5 + 6 = 11
  }

  public static void main(String[] args) {
    FindPivotIndex findPivotIndex = new FindPivotIndex();
    int[] nums = {1, 7, 3, 6, 5, 6};
    int result = findPivotIndex.pivotIndex(nums);
    System.out.println("Pivot index 1: " + result);

    int[] nums2 = {1, 2, 3};
    int result2 = findPivotIndex.pivotIndex(nums2);
    System.out.println("Pivot index 2: " + result2);

    int[] nums3 = {2, 1, -1};
    int result3 = findPivotIndex.pivotIndex(nums3);
    System.out.println("Pivot index 3: " + result3);
  }

  public int pivotIndex(int[] nums) {
    int pivotIndex = -1;
    int sum = 0;
    int leftsum = 0;
    for (int x : nums) {
      sum += x;
    }
    for (int i = 0; i < nums.length; ++i) {
      if (leftsum == (sum - leftsum - nums[i])) {
        pivotIndex = i;
        break;
      }
      leftsum += nums[i];
    }
    return pivotIndex;
  }
}
