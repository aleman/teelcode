
public class ReverseListIterative206 {

  public static void main(String[] args) {
    ListNode head = ListNode.list4();
    System.out.println(head);
    System.out.println("\n\n");
    ListNode reversed = reverseList(head);
    System.out.println(reversed);
  }

  public static ListNode reverseList(ListNode head) {
    if(head == null)
      return null;
    ListNode ret = null;

    ListNode p = head;
    while(p != null) {
      ListNode rest = p.next;
      if(ret == null) {
        ret = p;
        p.next = null;
      }
      else {
        p.next = ret;
        ret = p;
      }
      p = rest;
    } 
    return ret;
  }
}

