
import java.util.*;

public class SubdomainVisits811 {

  public static void main(String[] args) {
    System.out.println("subdomainVisits " + subdomainVisits(new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
  }

  public static List<String> subdomainVisits(String[] cpdomains) {
    List<String> ret = new ArrayList<>();
    Map<String,Integer> map = new HashMap<>();
    for(String cpdomain : cpdomains) {
      String[] parts = cpdomain.split(" ");
      int number = Integer.parseInt(parts[0]);
      int index = parts[1].lastIndexOf(".");
      Integer already = map.putIfAbsent(parts[1],number);
      if(null != already) {
        map.put(parts[1], number + already);
      }
      while(index != -1) {
        already = map.putIfAbsent(parts[1].substring(index + 1), number);
        if(null != already) {
          map.put(parts[1].substring(index + 1), number + already);
        }
        index = parts[1].lastIndexOf(".", index - 1);
      }
    }
    for(String key : map.keySet()) {
      ret.add(map.get(key) + " " + key);
    }
    return ret;
  }
}

