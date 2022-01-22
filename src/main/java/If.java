import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для сравнения");

        int i= scanner.nextInt();

        if(i==5){
            System.out.println("Verno");
        } else {
            System.out.println("Neverno");
        }
    }
}
