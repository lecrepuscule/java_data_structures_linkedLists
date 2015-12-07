class KthFromLast{
  public static LinkedListNode kthFromLast(LinkedListNode n, int k){
    if (n == null) return null;
    LinkedListNode runner = n;
    for (int i = 0 ; i < k ; i++){
      if (runner.next == null) return null;
      runner = runner.next;
    }
    while (runner.next != null){
      n = n.next;
      runner = runner.next;
    }
    return n;
  }
}