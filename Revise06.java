class Revise06 {
    public static void main(String[] args) {

        // Type Casting
        System.out.println();
        short x = 1;
        int y = x + 2;
        System.out.println(y); // 3 - Widening Casting. No Errors

        double z = 1.1;
        double m = z + 2;
        System.out.println(m); // 3.1 - When there is a double and integer operation, integer will convert to double and give an answer.

        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b); // 3 - Narrowing Casting

        // Convert String to a Number

        String k = "1";
        System.out.println(Integer.parseInt(k));   // 1
        System.out.println(Short.parseShort(k));   // 1
        System.out.println(Byte.parseByte(k));     // 1
        System.out.println(Long.parseLong(k));     // 1
        int u = Integer.parseInt(k) + 2;
        System.out.println(u);
        k = "1.1";
        System.out.println(Float.parseFloat(k));   // 1.1
        System.out.println(Double.parseDouble(k)); // 1.1
        double v = Double.parseDouble(k) + 2;
        System.out.println(v);                     // 3.1
    }
}
