import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal ", 1000, 1_000_000);
        float interestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte periodInYears = (byte) readNumber("Period in years: ", 5, 45);

        double mortgage = calculateMortgage(principal, interestRate, periodInYears);
        System.out.println("Your monthly payments are: £" + mortgage);
        System.out.println("Mortgage Payment Schedule");
        System.out.println("-------------------------");
        do {
            double v = principal -= mortgage;
            System.out.println("Your repayment schedule is £" + v);
        } while (principal > 0);

    }
        public static double readNumber (String prompt,double min, double max){
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

        return mortgage;

    }

}
