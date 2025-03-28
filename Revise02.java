import java.awt.Point;
import java.util.Date;

class Revise02 {
    public static void main(String[] args) {

        // Variables
        int age = 30;
        System.out.println("\n" + age);
        int height = 5, weight = 105;
        System.out.println(height + " " + weight);
        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);

        // Primitive Data Types
        byte num1 = 10;
        short num2 = 123;
        int num3 = 3520;
        long num4 = 5_263_968_765_465_876_557L;
        float num5 = 500F;
        double num6 = 2563.98;
        char letter = 'A';
        boolean isTrue = true;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(letter);
        System.out.println(isTrue);

        // Reference Data Types
        Date date = new Date();
        System.out.println("Time :- " + date);

        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        System.out.println(point1.x + " " + point1.y);
        System.out.println(point2.x + " " + point2.y);
        point2 = point1;
        point2.x = 5;
        System.out.println(point1.x + " " + point1.y);
        System.out.println(point2.x + " " + point2.y);
    }
}
