import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        There are two ways to create an array: The Traditional and modern method

//        One dimensional array

        //        Traditional
        int [] numbers = new int [5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println( Arrays.toString(numbers));

        //        Modern method
        int[] myArray = {2,4,1,5,3};
        Arrays.sort(myArray);

        System.out.println(myArray.length);
        System.out.println( Arrays.toString(myArray));


 //        Multi dimensional array

        //        Traditional
        int[] [] multiArray = new int [2][3];
        multiArray[0][0] = 1;
        multiArray[0][1] = 2;

        System.out.println(Arrays.deepToString(multiArray));

        //        Modern method
        int[] [] twoArray = {{1,2,3}, {4,5,6}};

        System.out.println(Arrays.deepToString(twoArray));

    }
}
