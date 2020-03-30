
import java.util.*;

public class CreateTargetArray1389 {

  public static void main(String[] args) {
    int size = args.length / 2;
    int[] nums = new int[size];
    int[] index = new int[size];
    for(int i = 0; i < size; i++) {
      nums[i] = Integer.parseInt(args[i]);
      index[i] = Integer.parseInt(args[i + size]);
    }
    System.out.println("nums..: " + Arrays.toString(nums));
    System.out.println("index.: " + Arrays.toString(index));
    int[] res = createTargetArray(nums, index);

    System.out.println("result: " + Arrays.toString(res));
  }

  public static int[] createTargetArray(int[] nums, int[] index) {
    int[] ret = new int[index.length];
    for(int i = 0; i < nums.length; i++) {
      ret[i] = -1;
    }
    for(int i = 0; i < nums.length; i++) {
      System.out.println("insert " + nums[i] + " at index " + index[i]);
      insertItemAtIndex(ret, nums[i], index[i]);
    }
    return ret;
  }

  public static void insertItemAtIndex(int[] data, int item, int index) {
    if(-1 == data[index]) {
      data[index] = item;
      return;
    }
      System.out.println("need to insert " + item + " at index " + index);
    int saved = data[index];
    data[index] = item;
    insertItemAtIndex(data, saved, index+1);
  }
}

