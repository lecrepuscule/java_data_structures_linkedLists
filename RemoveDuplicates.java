class RemoveDuplicates{
  public static void removeDupes(LinkedListNode head){
    if (head == null) return;
    LinkedListNode curr = head;
    LinkedListNode n = head;

    while(curr.next != null){
      while (n.next != null){
        if (curr.data.equals(n.next.data)){
          n.next = n.next.next;
        }
        n = n.next;
      }
      curr = curr.next;
    }
  }


  public static void removeDupes2(LinkedListNode head){
    if (head == null) return;
    HashTable buffer = new HashTable();
    LinkedListNode curr = head;
    buffer.put(head.data, true);
    while(curr.next != null){
      if (buffer.containsKey(curr.next.data)){
        curr.next = curr.next.next;
      } else {
        buffer.put(curr.next.data, true);
      }
      curr = curr.next;
    }
  }
}