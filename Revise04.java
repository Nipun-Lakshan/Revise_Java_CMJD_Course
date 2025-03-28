
import java.util.Arrays;

class Revise04 {
    public static void main(String[] args) {

        // Integer Variable - Store One Integer Value
        int num = 1;
        System.out.println("\n" + num); // 1

        // Integer Array
        int number[] = new int[10];
        number[0] = 5;
        number[1] = 5;
        number[2] = 5;
        number[3] = 5;
        number[4] = 5;
        number[5] = 5;
        System.out.println(Arrays.toString(number)); // [5, 5, 5, 5, 5, 5, 0, 0, 0, 0]

        int [] num1 = new int[5];
        num1[1] = 4;
        System.out.println(num1[1]); // 4
        Arrays.sort(number);
        System.out.println(Arrays.toString(number)); // [0, 0, 0, 0, 5, 5, 5, 5, 5, 5]
    }
}