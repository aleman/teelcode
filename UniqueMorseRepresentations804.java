
import java.util.*;

public class UniqueMorseRepresentations804 {

  public static void main(String[] args) {
    System.out.println(uniqueMorseRepresentations(new String[] {"gin","zen","gig","msg"}));
  }

  public static int uniqueMorseRepresentations(String[] words) {
    String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    StringBuilder sb = new StringBuilder(4*12);
    Set<String> set = new HashSet<>();
    for(String word : words) {
      System.out.println();
      System.out.println(word);
      for(byte each : word.getBytes()) {
        int index = each - 97;
        sb.append(morse[index]);
      }
      set.add(sb.toString());
      sb.setLength(0);
    }
    return set.size();
  }
}

