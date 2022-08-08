package urban.broccoli.datastructures.arraylist;

public class ArrayListDemo {
  
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
  
    arrayList.add("s");
    arrayList.add("t");
    arrayList.add("e");
    arrayList.add("s");
    arrayList.add("h");
    System.out.println("AL: " + arrayList);
    
    arrayList.add("a", 0);
    System.out.println("Add first: " + arrayList);
  
    System.out.println("Value of element with index 2: " + arrayList.get(2));
    System.out.println("Contains 'x': " + arrayList.contains("x"));
    
    arrayList.remove("h");
    System.out.println("AL: " + arrayList);
  }
}
