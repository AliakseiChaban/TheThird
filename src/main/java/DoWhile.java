import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int value;
      do{
          System.out.println("Fill five");
          value = scanner.nextInt();
      } while (value!=5);
        System.out.println("You filled five");
    }
}
