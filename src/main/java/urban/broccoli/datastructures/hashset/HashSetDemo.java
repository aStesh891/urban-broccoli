package urban.broccoli.datastructures.hashset;

public class HashSetDemo {
  
  public static void main(String[] args) {
    HashSetCustom<String> myMap = new HashSetCustom<>();
    myMap.add("Ireland");
    myMap.add("Canada");
    myMap.add("Norway");
    myMap.add("Italy");
  
    System.out.println("HS: " + myMap.toString());
    System.out.println("HS contains Italy: " + myMap.contains("Italy"));
    
    myMap.remove("Italy");
    myMap.remove("Canada");
    System.out.println("HS contains Italy: " + myMap.contains("Italy"));
  
    System.out.println("HS: " + myMap.toString());
  }
}
