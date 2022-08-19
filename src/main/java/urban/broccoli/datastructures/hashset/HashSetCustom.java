package urban.broccoli.datastructures.hashset;

import urban.broccoli.datastructures.hashmap.HashMapCustom;

public class HashSetCustom<E> {
  private HashMapCustom<E, Object> hashMapCustom;
  
  public HashSetCustom(){
    hashMapCustom=new HashMapCustom<>();
  }
  
  public void add(E value){
    hashMapCustom.put(value, null);
  }
  
  public boolean contains(E obj){
    return hashMapCustom.contains(obj) != null;
  }
  
  public boolean remove(E obj){
    return hashMapCustom.remove(obj);
  }
  
  @Override
  public String toString() {
    return hashMapCustom.toString();
  }
}