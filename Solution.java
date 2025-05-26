class Solution {
  public static boolean canPartition(int[] nums) {
    int sum = 0;
    int target = 0;
    for (int n : nums) {
      sum += n;
    }

    target = sum / 2;
    return helperfunc(nums, target, sum, 0);
  }

  public static boolean helperfunc(int[] nums, int target, int sum, int index) {
    if (target < 0) {
      return false;
    }
    if (target == 0) {
      return true;
    }
    if (index >= nums.length) {
      return false;
    }
    boolean include = helperfunc(nums, target - nums[index], sum, index + 1);
    boolean exclude = helperfunc(nums, target, sum, index + 1);
    boolean result = include || exclude;
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 5, 11, 5 };
    System.out.println(canPartition(nums));
  }
}