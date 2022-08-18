package urban.broccoli.datastructures.hashmap;

public class HashMapDemo {
  
  public static void main(String[] args) {
    HashMapCustom<String, String> myMap = new HashMapCustom<>(3);
    myMap.put("Ireland", "Dublin");
    myMap.put("Canada", "Ottawa");
    myMap.put("Norway", "Oslo");
    myMap.put("Italy", "Rome");
  
    System.out.println("HM: " + myMap.toString());
    System.out.println("HM size: " + myMap.size());
    System.out.println("HM get Italy: " + myMap.get("Italy"));
  }
}
