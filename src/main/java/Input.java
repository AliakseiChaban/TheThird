import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Print smth");

        String myString = console.nextLine();
        System.out.println("Вы ввели "+myString);
    }
}
