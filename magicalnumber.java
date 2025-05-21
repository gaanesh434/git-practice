import java.util.*;
import java.util.Scanner;

public class magicalnumber {
  public static void main(String args[]) {
    int[] arr = { 1, 2, 4, 3, 5 };
    Scanner sc = new Scanner(System.in);
    int B = sc.nextInt(); 

    int n = arr.length;
    int count = 1;
    int stored = 0;
    int firstcount = 1;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        count++;
      } else {
        stored = arr[i];
        firstcount = count;
        magicalnum(arr, n, count, firstcount, stored, B);
        count = 1;
      }
    }
    System.out.println(Math.max(firstcount, count));
  }

  public static void magicalnum(int[] arr, int n, int count, int firstcount, int stored, int B) {
    int secondcount = stored * B;
    int tempCount = count;

    for (int i = 0; i < n - 1; i++) {
      if (secondcount < arr[i + 1]) {
        tempCount++;
      } else {
        firstcount++;
      }
    }
    int ans = Math.max(firstcount, tempCount);
    System.out.println(ans);
  }
}
