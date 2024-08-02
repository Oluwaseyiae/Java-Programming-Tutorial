import java.text.NumberFormat;
import java.util.Scanner;

public class Projectone {
    public static void main(String[] args) {

        final byte Month_in_year = 12;
        final byte Percentage = 100;

//        Getting input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int Principle = sc.nextInt();

        System.out.print("Annual Intrest Rate: ");
        float annualIntrest = sc.nextFloat();
        float monthlyInterestRate = annualIntrest / Percentage / Month_in_year;

        System.out.print("Period (Years): ");
        byte years = sc.nextByte();

        double total = Principle * ( (annualIntrest *Math.pow(years, (1 + annualIntrest))) / (Math.pow(years,  (1+ annualIntrest))) - 1);
        String Mortgae = NumberFormat.getCurrencyInstance().format(total);
        System.out.println("The total mortgae is " + Mortgae);
    }
}
