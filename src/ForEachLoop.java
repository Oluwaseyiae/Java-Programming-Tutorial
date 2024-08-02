public class ForEachLoop {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Orange"};

        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }

//    For each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
