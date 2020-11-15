
import java.util.*;

public class MinTimeToVisitAllPoints1266 {

  public static void main(String[] args) {
    int[][] points = new int[2][];
    points[0] = new int[] {3, 2};
    points[1] = new int[] {-2, 2};
    System.out.println(minTimeToVisitAllPoints(points));
  }

  public static int minTimeToVisitAllPoints(int[][] points) {
    int[] point;
    int ret = 0;
    Integer x = null;
    Integer y = null;
    for(int each = 0; each < points.length; each++) {
      point = points[each];
      System.out.println(Arrays.toString(point) + "     x is " + x + "   , y is " + y);
      x = point[0];
      y = point[1];
      System.out.println("   next, x: " + x + " , y: " + y);
    }
    return ret;
  }

}

