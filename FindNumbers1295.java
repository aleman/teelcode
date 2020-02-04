
public class FindNumbers1295 {

  public static void main(String[] args) {
    int[] data = new int[] { 12,345,2,6,7896 };
    System.out.println(" ---> " + findNumbers(data));
  }

  public static int findNumbers(int[] nums) {
    int ret = 0;
    for(int number : nums) {
    int residue = 0;
    int value = number;
    int count = 0;
    while(value >= 0) {
      residue = value % 10;
      System.out.println(" residue " + residue);
      count++;
      if(value < 10) {
        break;
      }
      value = value / 10;
    }
    System.out.println(" count     " + count);
    if(count % 2 == 0) {
      ret++;
    }
    }

    return ret;
  }

}

