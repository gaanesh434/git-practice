class Bankrobbery {
  public int[] productExceptSelf(int[] nums) {
    int[] arr = new int[nums.length];
    int n = nums.length;
    for (int i = 0; i < n - 1; i++) {
      sum += (nums[i] * nums[i + 1]);
    }
    arr[i] = sum;
  }

  public static void main(String[] args) {
    int nums = { 1, 2, 3, 4 };

    Bankrobbery ans = new Bankrobbery();

  }
}