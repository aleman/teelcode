
import java.util.*;

public class DecompressRLElist1313 {

  public static void main(String[] args) {
    int[] nums = new int[] {1,2, 3,4};
    System.out.println(Arrays.toString(decompressRLElist(nums)));
  }

  public static int[] decompressRLElist(int[] nums) {
    int n = 0;
    for(int i = 0; i < nums.length; i = i + 2) {
      n += nums[i];
    }
    int[] ret = new int[n];
    int fish = 0;
    for(int i = 0; i < nums.length; i = i + 2) {
      int times = nums[i];
      int what = nums[i+1];
      for(int q = 0; q < times; q++) {
        ret[fish++] = what;
      }
    }
    return ret;
  }
}

