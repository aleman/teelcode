
public class SortedSquares977 {

  public static void print(int[] data) {
    int i = 0;
    for(int a : data) {
      System.out.println("[" + i + "] ... " + a);
      i++;
    }
  }

  public static void main(String[] args) {
    int[] data = new int[] {4};
    //int[] data = new int[] {-4,-1,0,3,10};
    print(data);
    int[] result = sortedSquares(data);
    System.out.println();
    print(result);
  }

  public static int[] sortedSquares(int[] A) {
    int[] ret = new int[A.length];
    int index = ret.length - 1;
    int start = 0;
    int end = index;
    while( index >= 0 ) {
      int value;
      if(Math.abs(A[start]) > Math.abs(A[end])) {
        value = A[start] * A[start];
        start++;
      }
      else {
        value = A[end] * A[end];
        end--;
      }
      ret[index--] = value;
    }
    return ret;
  }

}

