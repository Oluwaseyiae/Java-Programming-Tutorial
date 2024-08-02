import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.println("Input: ");
            input = sc.next().toLowerCase();

            if (input.equals("pass")){
                continue;
            }

            if(input.equals("quit")){
                break;
            }
            System.out.println(input);

        }
    }
}
