import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello World"+ i);
//            i++;
//        }

        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.println("Input: ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        }



//        DO-WHILE LOOP

        do {
            System.out.println("Input: ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));


    }
}
