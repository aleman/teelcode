
import java.util.*;

public class UniqueOccurrences1207 {

  public static void main(String[] args) {
    System.out.println(uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
    //System.out.println(uniqueOccurrences(new int[] {1,2}));
    //System.out.println(uniqueOccurrences(new int[] {1,2,2,1,1,3}));
  }

  public static boolean uniqueOccurrences(int[] arr) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int each : arr) {
      Integer already = map.putIfAbsent(each,1);
      System.out.println(each + " " + already);
      if(null != already) {
        map.put(each, already + 1);
      }
    }
    Set<Integer> set = new HashSet<>(map.values());
    return set.size() == map.keySet().size();
  }
}

