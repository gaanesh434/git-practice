public class DebugCount {
  public static int countTarget(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i <= arr.length; i++) {
      if (arr[i] == target)
        ;

      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] data = { 2, 3, 4, 3, 3 };
    System.out.println(countTarget(data, 3)); // Expected: 3
  }
}
