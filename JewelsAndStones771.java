
import java.util.*;

public class JewelsAndStones771 {

  public static void main(String[] args) {
    String J = args[0];
    String S = args[1];
    Set<Character> set = new TreeSet<>();
    for(int i = 0; i < J.length(); i++) {
      System.out.println(J.charAt(i));
      set.add(Character.valueOf(J.charAt(i)));
    }
    int count = 0;
    for(int i = 0; i < S.length(); i++) {
      if(set.contains(Character.valueOf(S.charAt(i)))) {
        count++;
      }
    }
    System.out.println(count);
  }
}

