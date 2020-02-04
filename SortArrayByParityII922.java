
import java.util.*;

public class SortArrayByParityII922 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortArrayByParityII(new int[] {4,2,5,7})));
  }

  public static int[] sortArrayByParityII(int[] A) {
    int[] ret = new int[A.length];
    int even = 0;
    int odd = 1;
    for(int each : A) {
      if(each % 2 == 0) {
        ret[even] = each;
        even += 2;
        continue;
      }
      ret[odd] = each;
      odd += 2;
    }
    return ret;
  }
}

