import java.util.*;

public class prime_ranges {

  static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  static void isPrimeRange(int n){
    for(int i = 2; i<=n; i++){
      if(isPrime(i)){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    isPrimeRange(100);
  }
}
