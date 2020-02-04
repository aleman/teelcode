
public class HasAlternatingBits693 {

  public static void main(String[] args) {
    //System.out.println("result for 5 " + hasAlternatingBits(5));
    //System.out.println("result for 11 " + hasAlternatingBits(11));
    System.out.println("result for 10 " + hasAlternatingBits(10));
    System.out.println("\n\n " + hasAlternatingBits(10));
  }

  public static boolean hasAlternatingBits(int n) {
    if(n == 0 || n == 1) {
      return true;
    }
    int val = n;
    int prevMod = 2;
    do {
      int mod = val % 2;
      System.out.println(val + " --> "  + mod + " , prev mod: " + prevMod);
      if(mod == prevMod)
        return false;
      prevMod = mod;
      val = val / 2;
    } while(val > 1);
    System.out.println(val + " --> "  + " , prev mod: " + prevMod);
    return prevMod != val;
  }

}

