import java.util.Arrays;

class Revise05 {
    public static void main(String[] args) {

        // 1D Arrays
        System.out.println();
        int num1[] = new int[10];
        System.out.println(Arrays.toString(num1)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // 2D Arrays
        int num2[][] = new int[2][3];
        num2[0][0] = 1;
        System.out.println(Arrays.toString(num2));
        // Print Hash Codes ["toString()"" Method suitable for 1D Array.] // [[I@372f7a8d], [I@2f92e0f4]]
        System.out.println(Arrays.deepToString(num2)); // [[1, 0, 0], [0, 0, 0]]
        int num3[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(num3)); // [[1, 2, 3], [4, 5, 6]]

        // 3D Arrays
        int num4[][][] = new int[5][4][3];
        num4[3][3][2] = 1;
        System.out.println(Arrays.deepToString(num4));
        // [[[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]],
        // [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]],
        // [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]],
        // [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 1]],
        // [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]]

        // Constant

        final float PI = 3.14F;
        System.out.println(PI);
        // PI = 20; When Final Keyword is used, we cannot assign a value for it.

        // Arithmetic Operations

        int x = 10 + 3;
        System.out.println(x); // 13
        int y = 10 - 3;
        System.out.println(y); // 07
        int z = 10 * 3;
        System.out.println(z); // 30
        int a = 10 / 3;
        System.out.println(a); // 03
        float f = (float)10 / (float)3;
        System.out.println(f); // 03.3333333
        int r = 10 % 3;
        System.out.println(r); // 01

        // Increment and Decrement Operators
        int w = 1;
        w++; // Equivalent to x = x + 1
        w--; // Equivalent to x = x - 1

        // Augmented Assignment Operator
        int q = 1;
        q += 5; // Equivalent to x = x + 5
        System.out.println(q);
    }
}
