import java.util.*;

public class Problem1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        isPrime = false;
      }
    }

    if (isPrime == true) {
      System.out.println("n is prime");
    } else {
      System.out.println("It is not a prime number");
    }

  }
}
