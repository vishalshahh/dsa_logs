
import java.util.*;

public class linearSearch {

  static int linearsearch(int numbers[], int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return numbers[i];
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = { 23, 45, 67, 87, 34, 53, 67, 32, 98 };
    int key = 53;
    int index = linearsearch(numbers, key);
    if (index == -1) {
      System.out.println("Not Found");
    } else {
      System.out.println("key found at index: " + index);
    }
  }
}
