import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your name: ");
        String name = scanner.nextLine();
        System.out.println("Please input your password: ");
        String password = scanner.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Your password is: " + password);

    }
}