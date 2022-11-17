import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name, serialN;
  int value;

  public Inventory(String name, String serialN, int value) {
    this.name = name;
    this.serialN = serialN;
    this.value = value;

  }

}

class Main {
  public static void main(String[] args) {
    int options = 0, value;
    String name, serialN;
    ArrayList<Inventory> item = new ArrayList<Inventory>();
    Inventory itemList;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");

      options = Integer.parseInt(scanner.nextLine()) ;
      if (options == 1) {
        System.out.println("Enter the name:");
        name = scanner.nextLine();

        System.out.println("Enter serial number:");
        serialN = scanner.nextLine();

        System.out.println("Enter the value in dollars (whole number):");
        value = Integer.parseInt(scanner.nextLine());
        itemList = new Inventory(name, serialN, value);
        item.add(itemList);
      }
      if (options == 2) {
        System.out.println("Enter the serial number of the item to delete:");
        serialN = scanner.nextLine();

        for (int i = 0; i < item.size(); i++) {
          if (item.get(i).serialN.equals(serialN)) {
            item.remove(i);
          }
        }
      }
      if (options == 3) {
        System.out.println("Enter the serial number of the item to change:");
        serialN = scanner.nextLine();
        for (int i = 0; i < item.size(); i++) {
          if (item.get(i).serialN.equals(serialN)) {
            System.out.println("Enter the new name:");
            name = scanner.nextLine();
            item.get(i).name = name;
            System.out.println("Enter the new value in dollars (whole number):");
            value = Integer.parseInt(scanner.nextLine());
            item.get(i).value = value;
          }
        }
      }
      if(options == 4){
        for(int i =0; i < item.size(); i++){
          System.out.println(item.get(i).name+","+item.get(i).serialN+","+item.get(i).serialN);
            
        }
      }
     
    } while (options != 5);
  }
}