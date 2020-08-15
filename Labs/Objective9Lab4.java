public class Objective9Lab4 {
  public static void main(String[] args) {

java.util.Scanner scanner = new java.util.Scanner(System.in);
double num1, num2;

System.out.println("Please give me a number: ");
            num1 = scanner.nextInt();
            System.out.println("Please give me another number: ");
            num2 = scanner.nextInt();


double average = ((num1 + num2) / 2);
System.out.println("The average of " + num1 + "and" + num2 + "is: " + average);

scanner.close();


  }

  /*
  Write/define the "findAverage" method here
  */
}
