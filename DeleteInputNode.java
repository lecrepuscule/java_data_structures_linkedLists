class DeleteInputNode{
  public static void deleteInputNode(LinkedListNode c){
    if (c==null || c.next == null) return;
    c.data = c.next.data;
    c.next = c.next.next;
  }
}