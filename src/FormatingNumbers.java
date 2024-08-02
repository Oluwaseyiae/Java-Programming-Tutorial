import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] args) {
        NumberFormat Capital = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String cap = Capital.format(10456456.234);
        String per= percent.format(0.1);

        System.out.println(per);

    // If we're going to be using the same specific values repeatedly, we can do it this way
        String salary = NumberFormat.getCurrencyInstance().format(500000.00);
        String tax = NumberFormat.getPercentInstance().format(0.2);

        System.out.println(salary);
    }
}
