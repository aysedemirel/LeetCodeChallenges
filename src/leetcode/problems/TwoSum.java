package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    List<Integer> result = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int index = 0; index < nums.length; index++) {
      if (!map.containsKey(nums[index])) {
        map.put(target - nums[index], index);
      } else {
        result.add(index);
        result.add(map.get(nums[index]));
        return result.stream().mapToInt(Integer::intValue).toArray();
      }
    }
    return new int[0];
  }

  public static void main(String[] args) {
    int[] nums = {-3, 4, 3, 90};
    int target = 0;
    TwoSum twoSum = new TwoSum();
    System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
  }
}
