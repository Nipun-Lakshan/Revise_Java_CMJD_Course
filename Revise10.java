class Revise10 {
    public static void main(String[] args) {

        /* Comparison Operators */

        System.out.println();
        int x = 6;
        int y = 8;
        System.out.println("6 is greater than 8 (6 > 8) : " + (x > y)); // False
        System.out.println("8 is greater than 6 (8 > 6) : " + (x < y)); // True
        System.out.println("8 is equal to 6 (8 == 6)    : " + (x == y)); // False
        System.out.println("6 is greater than or equal to 8 (6 >= 8) : " + (x >= y)); // False
        System.out.println("8 is greater than or equal 6 (8 >= 6)    : " + (x <= y)); // True
        System.out.println();

        /* Logical Operators */

        int temperature = 22;
        boolean isWarm = (temperature > 20) && (temperature < 30);
        System.out.println("Warm : " + isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalCode = true;

        System.out.println("Eligible to apply for a loan : " + ((hasHighIncome || hasGoodCredit) && !hasCriminalCode));
        System.out.println();

        /* If Statements */

        temperature = 15;
        if (temperature > 30) {
            System.out.println("It's a Hot Day!");
            System.out.println("Drink plenty of water!");
        } else if (temperature > 20) {
            System.out.println("It's a nice day!");
        } else {
            System.out.println("It's a cold day!");
        }
        System.out.println();

        /* Simplifying If Statement */

        int income = 120000;
        hasHighIncome = false;

        if (income > 100000){
                hasHighIncome = true;
        }

        System.out.println("Has High Income :- " + hasHighIncome);

        hasHighIncome = (income > 120000);
        System.out.println("Has High Income :- " + hasHighIncome);

    }
}
