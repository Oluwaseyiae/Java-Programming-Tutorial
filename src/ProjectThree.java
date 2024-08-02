import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectThree {
    public static void main(String[] args) {
        final byte Month_in_year = 12;
        final byte Percentage = 100;
        int Principal = 0;
        float annualIntrest = 0;
        float monthlyInterestRate = 0;
        byte years = 0;
        int numberOfPayments = 0;

        //        Getting input from the user
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Principal ($1K - $1M): ");
            Principal = sc.nextInt();

            if ((Principal >= 100_000) && (Principal <= 1_000_000) ){
                break;
            }
            System.out.println("Enter an amount between $100_000 and $1_000_000");
        }

        while (true) {
            System.out.print("Annual Intrest Rate: ");
            annualIntrest = sc.nextFloat();
            if (annualIntrest >= 1 && annualIntrest <= 30) {
                monthlyInterestRate = annualIntrest / Percentage / Month_in_year;
                break;
            }
            System.out.println("Enter an number that is beetween 1 and 30");
        }

        while(true){
                System.out.print("Period (Years): ");
                years = sc.nextByte();

                if (years >= 1 && years <=30){
                    numberOfPayments = Month_in_year * years;
                    break;
                }
            System.out.println("Enter a value between 1 and 30");
        }

        double total = Principal * ( (monthlyInterestRate *Math.pow(1 + annualIntrest, numberOfPayments)) / (Math.pow(1+ annualIntrest,numberOfPayments)) - 1);
        String Mortgage = NumberFormat.getCurrencyInstance().format(total);
        System.out.println("The total mortgage is " + Mortgage);
    }
}
