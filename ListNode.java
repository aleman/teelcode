
public class ListNode {

  int val;
  ListNode next;

  ListNode(int x) { val = x; }

  public String toString() {
    String ret = val + "";
    if(next != null) {
      ret += " -> " + next;
    }
    return ret;
  }

  public static ListNode listBig() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(1);
    head.next.next.next.next = new ListNode(0);
    head.next.next.next.next.next = new ListNode(0);
    head.next.next.next.next.next.next = new ListNode(1);
    head.next.next.next.next.next.next.next = new ListNode(1);
    head.next.next.next.next.next.next.next.next = new ListNode(1);
    head.next.next.next.next.next.next.next.next.next = new ListNode(0);
    head.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
    head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
    head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
    head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
    head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
    return head;
  }

  public static ListNode list5() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(0);
    head.next.next = new ListNode(1);
    return head;
  }

  public static ListNode list4() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    return head;
  }

  public static ListNode list3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    return head;
  }

  public static ListNode list2() {
    ListNode head = new ListNode(0);
    head.next = new ListNode(0);
    return head;
  }

  public static ListNode list1() {
    ListNode head = new ListNode(0);
    return head;
  }

  public static void main(String[] args) {
    ListNode head = list4();
    System.out.println(head);
  }
}

