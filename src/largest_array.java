import java.util.*;

// largest no in arrays
public class largest_array {
  static int largest(int numbers[]){
    int largestNo = Integer.MIN_VALUE;
    for(int i = 0; i < numbers.length; i++){
      if(largestNo <  numbers[i]){
        largestNo = numbers[i];
      }
    }
    return largestNo;
  }
  public static void main(String[] args) {
    int numbers[] = { 23, 45, 67, 87, 34, 53, 67, 32, 98 };
    System.out.println("Largest no is: " + largest(numbers));
  }
}
