import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Temperature: ");
        int temperature = sc.nextInt();

        if (temperature >30){
            System.out.println("It's a hot day, drink water.");
        } else if (temperature > 20 && temperature <= 30){
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }


    }
}
