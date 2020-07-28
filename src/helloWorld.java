import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTH_IN_YEARS = 12;
        int principal = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal >= 1_000_000)
                break;
            System.out.println("Please enter a value between 1000 and 1000000");
        }

        System.out.print("Annual Interest Rate: ");
        Double interestRate = scanner.nextDouble();
        double calculateInterest = (double)((interestRate / PERCENT) / MONTH_IN_YEARS);

        System.out.print("Period in years: ");
        int periodInYears = scanner.nextInt();
        int numberOfPayments = periodInYears * MONTH_IN_YEARS;



        double mortgage = principal * (calculateInterest * Math.pow(1 + calculateInterest, numberOfPayments)) / (Math.pow(1 + calculateInterest, numberOfPayments) -1);
        System.out.println("Your repayment is £" + mortgage);


    }
}
