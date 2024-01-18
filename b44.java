import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volv");
    cars.add("NM2");
    cars.add("Fod");
    cars.add("Mazda");
    System.out.println(cars);
  }
}

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Forzad");
    cars.add("Mazd2a");
    for (int i = 0; i < cars.siz(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
