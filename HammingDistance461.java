

public class HammingDistance461 {

  public static void main(String[] args) {
    System.out.println(hammingDistance(1,4));
  }

  public static int hammingDistance(int x, int y) {
    int bits = x ^ y;

    int count = 0;
    int index = 0;
    do {
      count += (bits & (1 << index)) >> index;
      System.out.println("index:" + index + " operation " + (bits & (1 << index)) + "   compare " );
      index++;
    } while( index < 32);

    return count;
  }
}

