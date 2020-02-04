
import java.util.*;

public class HeightChecker1051 {

  public static void main(String[] args) {
    System.out.println("height " + heightChecker(new int[] {1,1,4,2,1,3}));
  }

  public static int heightChecker(int[] heights) {
    int[] dest = Arrays.copyOf(heights, heights.length);
    Arrays.sort(dest);
    System.out.println(Arrays.toString(heights));
    System.out.println(Arrays.toString(dest));
    int ret = 0;
    for(int i = 0; i < dest.length; i++) {
      if(dest[i] != heights[i]) {
        ret++;
      }
    }
    return ret;
  }
}

