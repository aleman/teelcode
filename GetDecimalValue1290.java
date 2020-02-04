
public class GetDecimalValue1290 {

  public static void main(String[] args) {
    ListNode head = ListNode.listBig();
    System.out.println("result: " + getDecimalValue(head));
  }

  public static int getDecimalValue(ListNode head) {
    int[] digs = new int[30];
    int count = 0;
    while(head != null) {
      digs[count++] = head.val;
      head = head.next;
    }
    int ret = 0;
    int mult = 1;
    for(int i = 0; i < count; i++) {
      System.out.println("[" + i + "] " + digs[i]);
      if(digs[count - i - 1] == 1) {
        ret += mult;
      }
      mult *= 2;
    }
    return ret;
  }
}

