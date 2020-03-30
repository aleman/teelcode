
public class NumberOfSteps1342 {

  public static void main(String[] args) {
    Integer i = Integer.parseInt(args[0]);
    System.out.println(numberOfSteps(i));
  }

  public static int numberOfSteps (int num) {
    if(0 == num) {
      return 0;
    }
    if(num % 2 == 0) {
      return 1 + numberOfSteps(num/2);
    }
    return 1 + numberOfSteps(num-1);
  }
}

