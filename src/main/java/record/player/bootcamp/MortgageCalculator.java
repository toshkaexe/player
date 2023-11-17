    package record.player.bootcamp;


    import java.text.SimpleDateFormat;
    import java.util.Calendar;
    import java.util.Date;

    //Abgabe 7.11.23
public class MortgageCalculator {
    public static void main(String[] args) {
        double loanAmount = 100000; // Сумма кредита в евро
        double annualInterestRate = 2.12; // Годовая процентная ставка банка
        double monthlyInterestRate = annualInterestRate / 100 / 12; // Ежемесячная процентная ставка
        double loanTermInYears = 10; // Срок кредита в годах
        double annualRepaymentRate = 2.0; // Годовая ставка погашения долга
        double monthlyRepaymentRate = annualRepaymentRate / 100 / 12; // Ежемесячная ставка погашения долга

        int totalMonths = (int) (loanTermInYears * 12); // Общее количество месяцев

        // double monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -totalMonths)));
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Monat\tRestschuld\tZinsen\t\tTilgung\t\t\tRate");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        double totalInterest = 0.0;
        double totalRepayment = 0.0;
        double totalPrincipal = 0.0;
        double repayment = 0.0;
        double principal = 0.0;

        double interest = loanAmount * monthlyInterestRate;
        repayment = loanAmount * monthlyRepaymentRate;
        principal = repayment + interest;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        
        // Initialisierung des Datums für die erste Rate
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.printf("%d\t%s\t-%.2f€\t%.2f€\t\t%.2f€\t\t\t%.2f€%n",0,
                dateFormat.format(date), loanAmount, interest, repayment, loanAmount);
        for (int month = 1; month <= totalMonths; month++) {
            interest = loanAmount * monthlyInterestRate;
            if (month == 1) {
                repayment = loanAmount * monthlyRepaymentRate;
                principal = repayment + interest;
            } else {
                interest = loanAmount * monthlyInterestRate;
                repayment = principal - interest;

            }
            // Das Datum für die nächste Rate um einen Monat erhöhen
            int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            calendar.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);
            calendar.add(Calendar.MONTH, 1);
            date = calendar.getTime();
         /*   if (repayment < principal) {
                principal = repayment;
            }
*/
            loanAmount -= repayment;

            if (loanAmount > 0)
                System.out.printf("%d\t%s\t-%.2f€\t%.2f€\t\t%.2f€\t\t\t%.2f€%n",month,
                        dateFormat.format(date), loanAmount, interest, repayment, principal);

            totalInterest += interest;
            totalRepayment += repayment;
            totalPrincipal += principal;
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.printf("%s\t\t\t\t\t\t-%.2f€\t\t%.2f€\t%.2f€\t\t%.2f€%n",
                "Zinsbinbungsende",
                loanAmount,
                totalInterest,
                totalRepayment,
                totalPrincipal);



    }

}