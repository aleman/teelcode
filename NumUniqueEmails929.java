
import java.util.*;

public class NumUniqueEmails929 {

  public static void main(String[] args) {
    System.out.println("result: " + numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
  }

  public static int numUniqueEmails(String[] emails) {
    boolean seenAt;
    boolean ignore;
    StringBuffer sb = new StringBuffer();
    Set<String> set = new HashSet<>();
    for(String email : emails) {
      sb.setLength(0);
      seenAt = false;
      ignore = false;
      for(char c : email.toCharArray()) {
        if(seenAt) {
          sb.append(c);
        }
        else {
          if('@' == c) {
            seenAt = true;
            ignore = false;
          }
          if('.' == c) {
            continue;
          }
          if('+' == c) {
            ignore = true;
          }
          if(!ignore) {
             sb.append(c);
          }
        }
      }
      set.add(sb.toString());
    }
    return set.size();
  }

}

