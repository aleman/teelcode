

public class PeakIndexInMountainArray852 {

  public static void main(String[] args) {
    int[] data = new int[] {0,2,1,0};
    //int[] data = new int[] {0,1,0};

    System.out.println(peakIndexInMountainArray(data));
  }

  public static int peakIndexInMountainArray(int[] A) {
    int ret = 0;
    int i = 1;
    do {
      if(A[i] < A[ret]) {
        return ret;
      }
      ret++;
      i++;
    } while(i < A.length);
    return -1;
  }

}

