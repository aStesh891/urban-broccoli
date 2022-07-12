package urban.broccoli.datastructures.stack;

public class Stack<T> {
  
  private Node<T> head;
  
  /**
  * @return top value
  */
  public T peak() {
    return head.value;
  }
  
  /**
  * @return value and removes it
  */
  public T pop() {
    T value = head.value;
    head = head.next;
    return value;
  }
  
  /**
  * add new value
  */
  public void push(T t) {
    Node<T> node = new Node<>(t);
    node.next = head;
    head = node;
  }
  
  public boolean isEmpty() {
    return head == null;
  }
  
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node<T> currentNode = head;
    while (currentNode != null) {
      sb.append(currentNode.value);
      currentNode = currentNode.next;
    }
    return sb.toString();
  }
  
  public static class Node<T> {
    private T value;
    private Node<T> next;
    
    public Node(T value) {
      this.value = value;
    }
  }
}
