import java.util.Scanner;

class Revise08 {
    public static void main(String[] args) {

        System.out.println();

        // Reading Input from User
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? : ");

        // String name = scanner.next(); // Only take a one word. After spaces it will not take the input.
        String name = scanner.nextLine();
        System.out.println("Your name is " + name + ".\n");

        System.out.print("Enter your height in m : ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + ".\n");

        System.out.print("Enter your age : ");
        byte age = scanner.nextByte();
        System.out.println("Your age is " + age + ".");

    }
}
