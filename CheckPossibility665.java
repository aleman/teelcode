
public class CheckPossibility665 {

  public static void main(String[] args) {
    System.out.println(checkPossibility(new int[] {46}));
    System.out.println(checkPossibility(new int[] {146,47,48,48,50}));
    //System.out.println(new int[] {1,2,3,4,5,6});
  }

  public static boolean checkPossibility(int[] nums) {
    if(nums.length <= 2) {
      return true;
    }
    boolean ret = true;
    for(int i = 1; i < nums.length + 1; i++) {
      int prev = nums[i-1];
      int now = nums[i];
      int next = nums[i+1];
      System.out.println("[" + (i-1) + "] prev: " + prev);
      System.out.println("[" + i + "] now: " + now);
      System.out.println("[" + (i+1) + "] next: " + next);
      break;
    }
    return ret;
  }
}

