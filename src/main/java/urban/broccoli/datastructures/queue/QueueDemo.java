package urban.broccoli.datastructures.queue;

public class QueueDemo {
  
  public static void main(String[] args) {
    Queue<String> queue = new Queue<>();
    queue.enqueue("S");
    queue.enqueue("T");
    queue.enqueue("E");
    queue.enqueue("S");
    queue.enqueue("H");
    
    System.out.println("peek: " + queue.peek());
    queue.dequeue();
    System.out.println("peek: " + queue.peek());
    queue.dequeue();
    System.out.println("peek: " + queue.peek());
    queue.dequeue();
    System.out.println("peek: " + queue.peek());
    queue.dequeue();
    System.out.println("peek: " + queue.peek());
  }
}
