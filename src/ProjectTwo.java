import java.util.Scanner;

public class ProjectTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

//        5 -Fizz  3 - Buzz   5&3 - FizzBuzz

        if  (num % 5 == 0 && num % 3 == 0){
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Buzz");
        } else if  (num % 5 == 0){
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }
    }
}
