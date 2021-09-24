package leetcode.algorithm;

public class BinarySearch {

  private int[] arr;

  public BinarySearch(int[] arr) {
    this.arr = arr;
    System.out.println("Array size: " + arr.length);
  }

  public int search(int num, int start, int end) {
    int index = start + (end - start) / 2;
    if (start > end) {
      return -1;
    } else if (start == end && index >= arr.length) {
      return -1;
    } else if (index == arr.length && arr[index] != num) {
      return -1;
    } else if (arr[index] < num) {
      return search(num, index + 1, end);
    } else if (arr[index] > num) {
      return search(num, start, index - 1);
    } else {
      return index;
    }
  }

  public static void main(String[] args) {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;
    BinarySearch binarySearch = new BinarySearch(nums);
    int result = binarySearch.search(target, 0, nums.length);
    System.out.println("Result: " + result);
  }
}
