import java.text.NumberFormat;
import java.util.Scanner;

/* Mortgage Calculator - Assignment 01*/

class Revise09 {

    public static void main(String[] args) {

        final double MONTHS_PER_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Principal Amount ($)     : ");
        long principalAmount = scanner.nextLong();
        System.out.print("Annual Interest Rate (%) : ");
        float interestRate = scanner.nextFloat();
        System.out.print("Period (in Years)        : ");
        int period = scanner.nextInt();

        double interestRatePerMonth = (((double) interestRate / PERCENT) / MONTHS_PER_YEAR);
        double periodInMonths = ((double) period * MONTHS_PER_YEAR);

        double mortgage = principalAmount
                * ((Math.pow((1 + interestRatePerMonth), periodInMonths)) * interestRatePerMonth)
                / (Math.pow((1 + interestRatePerMonth), periodInMonths) - 1);
        System.out.println("Mortgage                 : " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

}