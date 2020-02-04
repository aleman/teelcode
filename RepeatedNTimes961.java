
import java.util.Arrays;

public class RepeatedNTimes961 {

  public static void main(String[] args) {
    int[] A = {5,1,5,2,5,3,5,4};
    //int[] A = {1,2,3,3};
    System.out.println(repeatedNTimes(A));
  }

  public static int repeatedNTimes(int[] A) {
    Arrays.sort(A);
    int n = A.length / 2;
    int item = -1;
    int times = 0;
    for(int a : A) {
      if(a != item) {
        // seeing new item
        item = a;
        times = 1;
      }
      else {
        times++;
      }
      if(times == n) {
        return item;
      }
    }
    return -1;
  }

  public static void print(int[] data) {
    for(int a : data)
      System.out.println(a);
  }
}

