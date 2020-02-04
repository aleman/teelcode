
import java.util.*;

public class CountCharacters1160 {

  public static void main(String[] args) {
        System.out.println(countCharacters(new String[] {"cat", "bt", "hat", "tree"}, "atach"));
        //System.out.println(countCharacters(new String[] {"hello", "world", "leetcode"}, "welldonehoneyr"));
  }

  public static byte[] getCharFrequencey(String chars) {
    byte[] charsFreq = new byte[128-80];
    for(byte each : chars.getBytes()) {
      charsFreq[each-80]++;
    }
    return charsFreq;
  }

  public static int countCharacters(String[] words, String chars) {
    byte[] charsFreq = getCharFrequencey(chars);
    int ret = 0;
    System.out.println(Arrays.toString(charsFreq));
    for(String word : words) {
      byte[] freq = getCharFrequencey(word);
      boolean bad = false;
      for(int i = 0; i < freq.length; i++) {
        if(freq[i] > charsFreq[i]) {
          bad = true;
          break;
        }
      }
      if(bad) {
        continue;
      }
      ret += word.length();
    }
    return ret;
  }

}

