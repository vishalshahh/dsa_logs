import java.util.*;

public class prime_number_2 {

  static boolean isPrime(int n){
    for(int i = 2; i <= Math.sqrt(n); i++){
      if( n % i == 0){
        return false;
      }
    }
    return true;
  }


public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  System.out.println(isPrime(n));
}
}
