public class pairs_arrays {
  static void printPairs(int numbers[]) {
    for (int i = 0; i < numbers.length; i++) {
      int curr = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.print("(" + curr + "," + numbers[j] + ")");
      }
      System.out.println();
    }
  }

  public static void main(Stcring[] args) {
    int numbers[] = { 1, 3, 5, 7, 9, 10 };
    printPairs(numbers);
  }
}
