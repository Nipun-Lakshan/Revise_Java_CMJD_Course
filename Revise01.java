class Revise01 {
    public static void main(String args[]) {
        greet();
        printSum(25, 50);
        System.out.println(getTen());
        System.out.println(add(20,50));
    }

    /* Type 01: No Return Type, No Input */
    public static void greet() {
        System.out.println("\nHello!");
    }

    /* Type 02: With arguments, No return */
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    /* Type 03: No arguments, Return Value */
    public static int getTen() { 
        return 10; 
    }

    /* Type 04: With arguments, Return a value */
    public static int add(int a, int b) { 
        return a + b; 
    }
}
