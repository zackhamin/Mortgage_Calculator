import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTH_IN_YEARS = 12;
        int principal = 0;
        double interestRate = 0.0;
        double calculateInterest = 0.0;
        int numberOfPayments = 0;
        int periodInYears = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Please enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            interestRate = scanner.nextDouble();
            if (interestRate > 0 && interestRate <= 30)
                break;
            System.out.println("Please enter a value between 1 and 30");
        }
        calculateInterest = (double) ((interestRate / PERCENT) / MONTH_IN_YEARS);

        while (true) {
            System.out.print("Period in years: ");
            periodInYears = scanner.nextInt();
            if (periodInYears >= 5 && periodInYears <= 45)
                break;
            System.out.println("Please pick a year range between 5 and 45");
        }

        numberOfPayments = periodInYears * MONTH_IN_YEARS;
        double mortgage = principal * (calculateInterest * Math.pow(1 + calculateInterest, numberOfPayments)) / (Math.pow(1 + calculateInterest, numberOfPayments) -1);
        System.out.println("Your repayment is £" + mortgage);
    }
}
