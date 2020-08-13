public class Objective7Lab5 {
  public static void main(String[] args) {
  java.util.Scanner scanner = new java.util.Scanner(System.in);

  System.out.println("____Menu____");
  System.out.println("1: Say Hello");
  System.out.println("2: List My Favorite Foods");
  System.out.println("3: Exit");
  System.out.println();

  int selection = scanner.nextInt();

  if(selection == 1){
    System.out.println("Hello Human ");
  }

  if(selection == 2){
    System.out.println("Apples, Bananas, Coconuts ");
  }

  if(selection == 3);{
    System.out.println("Goodbye");

  }




    scanner.close();
  }
}
