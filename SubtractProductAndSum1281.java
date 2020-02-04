
public class SubtractProductAndSum1281 {

  public static void main(String[] args) {
    for(int i : new int[] {234,4421,0,1,2,3,4,8,9,10,11,12,13,14,33,45,67,89,94,98,99,100,101,102,103,123,134,156,246,587,890,998,1234}) {
      System.out.println(" ---> " + subtractProductAndSum(i));
      System.out.println("\n\n");
    }
  }

  public static int subtractProductAndSum(int n) {
    int residue = 0;
    int value = n;
    int product = 1;
    int sum = 0;
    while(value >= 0) {
      residue = value % 10;
      System.out.println(" residue " + residue);
      product *= residue;
      sum += residue;
      if(value < 10) {
        System.out.println(" value < 10 ");
        break;
      }
      value = value / 10;
    }
    System.out.println(" product " + product );
    System.out.println(" sum     " + sum);

    return product - sum;
  }

}

