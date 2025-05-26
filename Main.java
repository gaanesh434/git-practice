import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int prev = arr[0];
      int count = 1;

      for (int i = 1; i < n; i++) {
        if (arr[i] > prev + 1) {
          count++;
          prev = arr[i];
        }
      }
      System.out.println(count);
    }
  }
}

// codeforces contest question