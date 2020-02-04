
public class Fib509 {

  public static void main(String[] args) {
    System.out.println(fib(4));
  }

  public static int fib(int N) {
    if(N == 0) {
      return 0;
    }
    if(N == 1) {
      return 1;
    }
    int prev = 1;
    int prevprev = 0;
    int ret = 0;
    int i = 2;
    do {
      ret = prev + prevprev;
      System.out.println("fiv of " + i + " is prev + prevprev = " + prev + " + " + prevprev + " = " + ret);
      prevprev = prev;
      prev = ret;
      i++;
    } while( i <= N);
    return ret;
  }
}

