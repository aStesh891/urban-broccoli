package urban.broccoli.datastructures.queue;

public class Queue<T> {
  
  private Node<T> head;
  private Node<T> tail;
  
  /**
  * add new element
  */
  public void enqueue(T t) {
    Node<T> node = new Node<>(t);
    if (head == null) {
      head = node;
    }
    
    if (tail != null) {
      tail.next = node;
    }
    tail = node;
  }
  
  /**
  * delete last element
  */
  public void dequeue() {
    head = head.next;
    if (head == null) {
      tail = null;
    }
  }
  
  /**
   * @return first element value
   */
  public T peek() {
    return head.value;
  }
  
  private static class Node<T> {
    private final T value;
    private Node<T> next;
    
    private Node(T value) {
      this.value = value;
    }
  }
}
