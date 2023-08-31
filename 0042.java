import java.util.ArrayList;

public class IterateList {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("C++");
    for (String element : list) {
      System.out.println(element);
    }
  }
}
