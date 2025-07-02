import java.util.*;

public class binary_search {

  static int BinarySearch(int numbers[], int key) {
    int start = 0;
    int end = numbers.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (numbers[mid] == key) {
        return mid;
      }

      if (numbers[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = { 12, 14, 34, 56, 67, 78 };
    int key = 67;

    System.out.println(BinarySearch(numbers, key));
  }
}
