
public class SortArrayByParity905 {

  public static void main(String[] args) {
    int[] data = new int[] {3,1,2,4};
    int[] ret = sortArrayByParity(data);
  }

  public static int[] sortArrayByParity(int[] A) {
    int index = 0;
    int last = A.length - 1;
    while(index < last) {
      int item = A[index];
      if(item % 2 == 0) {
        // even is where we want it
        index++;
        continue;
      }
      // we know index points to an odd number
      System.out.println("[" + index + "] is odd " + A[index]);
      int lastItem = A[last];
      if(lastItem % 2 == 1) {
        // odd is where we want it
        last--;
        continue;
      }
      // swap
      A[index] = lastItem;
      A[last] = item;
      index++;
    }
    for(int i = 0; i < A.length; i++) {
      System.out.println("[" + i + "] ... " + A[i]);
    }
    return A;
  }
}

