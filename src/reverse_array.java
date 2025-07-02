public class reverse_array {

  static void reverse(int numbers[]){
    int start = 0;
    int end = numbers.length-1;

    while(start < end){
      int temp = numbers[end];
      numbers[end] = numbers[start];
      numbers[start] = temp;

      start ++;
      end--;
    }

  }
  public static void main(String[] args) {
    int numbers[] = { 12, 14, 34, 56, 67, 78 };
    reverse(numbers);

    for(int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
  }
}
