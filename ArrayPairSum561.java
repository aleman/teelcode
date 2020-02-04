
import java.util.Arrays;

public class ArrayPairSum561 {

  public static void main(String[] args) {
    int[] data = new int[] {1,4,3,2};
    System.out.println(arrayPairSum(data));
  }

  public static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int i = 0;
    int sum = 0;
    do {
      sum += Math.min(nums[i], nums[i+1]);
      i++;
      i++;
    } while(i < nums.length);
    return sum;
  }

}

