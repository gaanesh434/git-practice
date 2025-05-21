public class PartitionEqualSubsetSum {
  public boolean Partition(int[] nums) {
    int ans = 0;
    for (int n : nums) {
      ans += n;
    }
    if (ans % 2 != 0) {
      return false;
    }
    int target;
    target = ans / 2;
    return PartitionTarget(nums, target, 0);
  }

  public boolean PartitionTarget(int[] nums, int target, int index) {
    if (target == 0)
      return true;
    if (index == nums.length || target < 0)
      return false;

    boolean include = PartitionTarget(nums, target - nums[index], index + 1);
    boolean exclude = PartitionTarget(nums, target, index + 1);

    return include || exclude;
  }

  public static void main(String[] args) {
    PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum();
    int[] nums = { 1, 5, 11, 5 };
    System.out.println(solution.Partition(nums));
  }
}