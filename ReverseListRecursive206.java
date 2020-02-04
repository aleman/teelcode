ReverseListRecursive206.java
public class ReverseListRecursive206 {

  public static void main(String[] args) {
    ListNode head = ListNode.list1();
    System.out.println(head);
    System.out.println("\n\n");
    ListNode reversed = reverseList(head);
    System.out.println(reversed);
  }

  public static ListNode reverseList(ListNode head) {
    if(head == null)
      return null;
    if(head.next == null) {
      return head;
    }
    ListNode last = head;
    ListNode secondNode = head.next;
    ListNode restInverted = reverseList(head.next);
    secondNode.next = last;
    last.next = null;
    return restInverted;
  }
}

