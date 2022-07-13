package urban.broccoli.datastructures.linkedlist;

public class LinkedListDemo {
  
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>();
  
    linkedList.addLast("s");
    linkedList.addLast("t");
    linkedList.addLast("e");
    linkedList.addLast("s");
    linkedList.addLast("h");
    System.out.println("LL: " + linkedList);
    
    linkedList.addFirst("a");
    System.out.println("LL: " + linkedList);
  
    System.out.println("Index of element with value e: " + linkedList.get("e"));
    System.out.println("Index of element with value e: " + linkedList.get("x"));
    
    linkedList.remove("h");
    System.out.println("LL: " + linkedList);
  }
}
