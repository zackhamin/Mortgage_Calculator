import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {

        int principal = 0;
        float interestRate = 0;
        byte periodInYears = 0;


        readNumber("Principal ", 1000, 1_000_000);
        readNumber("Annual Interest Rate: ", 1, 30);
        readNumber("Period in years: ", 5, 45);

        calculateMortgage(principal, interestRate, periodInYears);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value > min && value <= max)
                break;
            System.out.println("Please enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principal, float interestRate, byte periodInYears){
        final byte PERCENT = 100;
        final byte MONTH_IN_YEARS = 12;
        int numberOfPayments = periodInYears * MONTH_IN_YEARS;

        double calculateInterest = (double) ((interestRate / PERCENT) / MONTH_IN_YEARS);
        double mortgage = principal * (calculateInterest * Math.pow(1 + calculateInterest,
                numberOfPayments)) / (Math.pow(1 + calculateInterest, numberOfPayments) -1);

        System.out.println("Your repayment is £" + mortgage);
        return mortgage;
    }
}
