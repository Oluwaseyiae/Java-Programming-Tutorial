public class ConstantVar {
    public static void main(String[] args) {
        final int age = 30;

        System.out.println("This "+ age + " cannot be changed.");

        final float pi = 3.14F;

        float radius = 6;
        double areaOfCircle = pi * (radius*radius);

        System.out.println(areaOfCircle);
    }
}
