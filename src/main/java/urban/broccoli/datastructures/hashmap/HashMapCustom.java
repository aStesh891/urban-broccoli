package urban.broccoli.datastructures.hashmap;

public class HashMapCustom<K, V> {
  private Node<K, V>[] buckets;
  private int capacity;   //default 16
  
  private int size = 0;
  
  private double lf = 0.75;
  
  public HashMapCustom() {
    this(16);
  }
  
  public HashMapCustom(int capacity) {
    this.capacity = capacity;
    this.buckets = new Node[this.capacity];
  }
  
  public void put(K key, V value) {
    if (size == lf * capacity) {
      // rehash
      Node<K, V>[] old = buckets;
      
      capacity *= 2;
      size = 0;
      buckets = new Node[capacity];
      
      for (Node<K,V> e: old) {
        while (e != null) {
          put(e.key, e.value);
          e = e.next;
        }
      }
    }
    Node<K, V> node = new Node<>(key, value, null);
    
    int bucket = getHash(key) % getBucketSize();
    
    Node<K, V> existing = buckets[bucket];
    if (existing == null) {
      buckets[bucket] = node;
      size++;
    } else {
      // compare the keys see if key already exists
      while (existing.next != null) {
        if (existing.key.equals(key)) {
          existing.value = value;
          return;
        }
        existing = existing.next;
      }
      
      if (existing.key.equals(key)) {
        existing.value = value;
      } else {
        existing.next = node;
        size++;
      }
    }
  }
  
  public V get(K key) {
    Node<K, V> bucket = buckets[getHash(key) % getBucketSize()];
    
    while (bucket != null) {
      if (key == bucket.key) {
        return bucket.value;
      }
      bucket = bucket.next;
    }
    return null;
  }
  
  public boolean remove(K deleteKey) {
    int bucket = getHash(deleteKey) % getBucketSize();
  
    if (buckets[bucket] == null) {
      return false;
    } else {
      Node<K, V> previous = null;
      Node<K, V> current = buckets[bucket];
      
      while (current != null) { //have reached last entry node of bucket
        if (current.key.equals(deleteKey)) {
          if (previous == null) {  //delete first entry node
            buckets[bucket] = buckets[bucket].next;
            return true;
          } else {
            previous.next = current.next;
            return true;
          }
        }
        previous = current;
        current = current.next;
      }
      return false;
    }
    
  }
  
  public K contains(K key) {
    int bucket = getHash(key) % getBucketSize();
    if (buckets[bucket] == null) {
      return null;
    } else {
      Node<K, V> temp = buckets[bucket];
      while (temp != null) {
        if (temp.key.equals(key))
          return key;
        temp = temp.next; //return value corresponding to key.
      }
      return null;   //returns null if key is not found.
    }
  }
  
  public int size() {
    return size;
  }
  
  private int getBucketSize() {
    return buckets.length;
  }
  
  private int getHash(K key) {
    return key == null ? 0 : Math.abs(key.hashCode());
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Node node : buckets) {
      sb.append("[");
      while (node != null) {
        sb.append(node);
        if (node.next != null) {
          sb.append(", ");
        }
        node = node.next;
      }
      sb.append("]");
    }
    return "{" + sb.toString() + "}";
  }
  
  private static class Node<K, V> {
    final K key;
    V value;
    Node<K, V> next;
    
    public Node(K key, V value, Node<K, V> next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
    
    public K getKey() {
      return key;
    }
    
    public V getValue() {
      return value;
    }
    
    public Node<K, V> getNext() {
      return next;
    }
    
    @Override
    public boolean equals(Object obj) {
      if (obj == this) return true;
      
      if (obj instanceof HashMapCustom.Node) {
        Node node = (Node) obj;
        
        return key.equals(node.getKey()) &&
            value.equals(node.getValue());
      }
      return false;
    }
    
    @Override
    public int hashCode() {
      int hash = 15;
      hash = 19 * hash + ((key == null) ? 0 : key.hashCode());
      hash = 19 * hash + ((value == null) ? 0 : value.hashCode());
      return hash;
    }
    
    @Override
    public String toString() {
      return "{" + key + ", " + value + "}";
    }
  }
}