import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTH_IN_YEARS = 12;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();


        System.out.print("Annual Interest Rate: ");
        Double interestRate = scanner.nextDouble();
        double calculateInterest = (double)((interestRate / PERCENT) / MONTH_IN_YEARS);

        System.out.print("Period in years: ");
        int periodInYears = scanner.nextInt();
        int numberOfPayments = periodInYears * MONTH_IN_YEARS;



        double mortgage = principal * (calculateInterest * Math.pow(1 + calculateInterest, numberOfPayments)) / (Math.pow(1 + calculateInterest, numberOfPayments) -1);

        System.out.println(numberOfPayments);
        System.out.println(calculateInterest);

        Currency mortgageFormatted = NumberFormat.getCurrencyInstance().getCurrency();
        Currency currencyResult = mortgageFormatted;
        System.out.println("Your repayment is £" + mortgage);


    }
}
