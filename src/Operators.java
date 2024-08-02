public class Operators {
    public static void main(String[] args) {

//1.        Arithmetic Operation
        int x = 10;
        int y = 20;

        int z = x + y;
        int a = x - y;
        int b = x * y;
//        The division will not give the real result if it is not casted.
        int c = b / z;
        double d = (double)b / (double)z;

//        System.out.println(z);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);


//2.        Increment Operator
        //        Method 1
        int f = 10;
        f++;
        int g= 10;
        ++g;
//        System.out.println(f);
//        System.out.println(g);

        int p1 = 1;
//        if the increment sign is at the suffix in this case, it will not have any effect on the value
        int p2 = p1++;
        int p3 = ++p1;

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);


//3.        Assignment Operators

        int value = 5;
        value = value +10;
        value += 10;
//        System.out.println(value);



//4.    Comparison Operator
        int tolaAge = 18;
        int shadeAge = 20;
//        System.out.println(tolaAge == shadeAge);
//        System.out.println(tolaAge < shadeAge);
//        System.out.println(tolaAge > shadeAge);
//        System.out.println(tolaAge <= shadeAge);
//        System.out.println(tolaAge >= shadeAge);



//5.        Logical Operator
        //        AND  - &&
        int temperature = 32;
        boolean iswarm = temperature > 20 && temperature < 30;
        System.out.println(iswarm);

        //        OR - ||
        boolean hasHigheIcome = false;
        boolean hasGoodCredit = true;
        Boolean hasCriminalRecord = false;
        boolean isEligible = hasHigheIcome || hasGoodCredit;
        System.out.println(isEligible);

        //        NOT - !

        boolean isGood = (hasHigheIcome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isGood);

    }
}
