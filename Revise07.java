import java.text.NumberFormat;

class Revise07 {
    public static void main(String[] args) {

        // Constants in Math Class
        System.out.println();
        double PI = Math.PI;
        System.out.println(PI);
        double E = Math.E;
        System.out.println(E);
        System.out.println();

        // Methods in Math Class
        System.out.println("1.1 is rounded to integer :- " + Math.round(1.1)); // 1 - Return Integer
        System.out.println("1.1 is ceiled to integer  :- " + Math.ceil(1.1));  // 2 - Return Double
        System.out.println("1.1 is floored to integer :- " + Math.floor(1.1)); // 1 - Return Double
        System.out.println("Max between 1 and 2 :- " + Math.max(1, 2));        // 2 - Max Number
        System.out.println("Min between 1 and 2 :- " + Math.min(1, 2));        // 1 - Min Number
        System.out.println("Random number between 0 and 1   :- " + Math.random());            // Value between 0 to 1 [Return Type :- Double]
        System.out.println("Random number between 0 and 100 :- " + Math.random() * 100);      // 0 - 100 [Return Type Double]
        System.out.println("Random Integer between 0 and 100:- " + (int)(Math.random()*100)); // Integer between 0 - 100
        System.out.println();

        // Formatting Numbers
        // NumberFormat currency = new NumberFormat(); - NumberFormat is a abstract class. Cannot initiated objects directly.

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(1234567.891);
        System.out.println(result1); // $1,234,567.89

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2); // 10%

        String result3 = NumberFormat.getPercentInstance().format(0.04);
        System.out.println(result3); // 4%
    }
}
