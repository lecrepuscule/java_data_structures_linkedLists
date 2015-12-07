class Partition{
  public static void partition(LinkedListNode n, int x){
    if (n==null) return;
    LinkedListNode head = n;
    While(n.next!=null){
      curr = n.next;
      if(curr.data<x){
        n.next = curr.next;
        curr.next = head;
        head = curr;
      } else {
        n = curr;
      }
    }
  }
}