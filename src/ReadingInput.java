import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        String info = "My name is "+name+". I am "+age+" years old.";
        System.out.println(info);
    }
}
