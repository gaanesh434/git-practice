public class PerfectSumProblem {
  public static int perfect(int[] nums, int target) {
    return PerfectSum(nums, target, 0);
  }

  public static int PerfectSum(int[] nums, int target, int index) {
    if (target == 0) {
      return 1;
    }
    if (index == nums.length || target < 0)
      return 0;

    int include = PerfectSum(nums, target - nums[index], index + 1);
    int exclude = PerfectSum(nums, target, index + 1);

    return include + exclude;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 5, 1, 4, 3 };
    int target = 10;
    int ans = perfect(nums, target);
    System.out.println(ans);
  }
}