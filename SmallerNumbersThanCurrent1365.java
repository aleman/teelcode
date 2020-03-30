import java.util.*;


public class SmallerNumbersThanCurrent1365 {

  public static void main(String[] args) {
    int[] data = new int[args.length];
    int i = 0;
    for(String each : args) {
      data[i++] = Integer.parseInt(each);
    }
    System.out.println(Arrays.toString(data));
    int[] ret = smallerNumbersThanCurrent(data);
    System.out.println(Arrays.toString(ret));
  }

  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] sorted = Arrays.copyOf(nums, nums.length);
    int[] ret = new int[nums.length];
    Arrays.sort(sorted);
    System.out.println(Arrays.toString(sorted) + " <-- sorted");
    int prev = -1;
    for(int i = 0; i < sorted.length; i++) {
      if(prev == sorted[i]) {
        continue;
      }
      System.out.println("number " + sorted[i] + " has " + i + " items less than itself");
      prev = sorted[i];
      for(int m = 0; m < nums.length; m++) {
        if(nums[m] == sorted[i]) {
          ret[m] = i;
        }
      }
    }
    return ret;
  }
}

