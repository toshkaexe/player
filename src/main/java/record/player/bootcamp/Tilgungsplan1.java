package record.player.bootcamp;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tilgungsplan1 {
    public static void main(String[] args) {
        double darlehensbetrag = 100000.00; // Beispielbetrag
        double sollzins = 2.12; // Beispiel-Zinssatz in Prozent
        double anfaenglicheTilgung = 2.0; // Beispiel anfängliche Tilgung in Prozent
        int zinsbindung = 5; // Beispiel Zinsbindung in Jahren

        generateTilgungsplan(darlehensbetrag, sollzins, anfaenglicheTilgung, zinsbindung);

    }
    private static void generateTilgungsplan(double darlehensbetrag,
                                             double sollzins,
                                             double anfaenglicheTilgung,
                                             int zinsbindung) {
        sollzins /= 100;
        anfaenglicheTilgung /= 100;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        System.out.println("Datum\t\tRestschuld\t\tZinsen\t\tTilgung\t\tRate");


        double restschuld = darlehensbetrag;
        double rate = calculateRate(darlehensbetrag, sollzins, anfaenglicheTilgung, zinsbindung);
        DecimalFormat df = new DecimalFormat("0.00");


        double totalZinsen = 0.0, totalTilgung = 0.0, totalRate = 0.0;
        System.out.println(dateFormat.format(calendar.getTime()) + "\t" + "-"+df.format(restschuld) + "\t\t0,00\t\t"+ "-"+df.format(restschuld)+"\t"+ "-"+df.format(restschuld) );

        zinsbindung = zinsbindung*12;
        while (zinsbindung > 0) {
            int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            calendar.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);

            double zinsen = (sollzins / 12) * restschuld;
            double tilgung = rate - zinsen;
            restschuld -= tilgung;

            System.out.println(dateFormat.format(calendar.getTime()) + "\t" + df.format(restschuld) + "\t\t" +
                    df.format(zinsen) + "\t\t" + df.format(tilgung) + "\t\t" + df.format(rate));

            calendar.add(Calendar.MONTH, 1);
            zinsbindung--;

            totalZinsen += zinsen;
            totalTilgung += tilgung;
            totalRate += rate;

        }
        System.out.println("Restschuld\t" + df.format(restschuld) + "\t\t" + df.format(totalZinsen) + "\t\t" + df.format(totalTilgung) + "\t\t" + df.format(totalRate));

    }
    private static double calculateRate(double darlehensbetrag, double sollzins, double anfaenglicheTilgung, int zinsbindung) {
        double rate;
        double months = zinsbindung * 12;
        rate = (darlehensbetrag * (sollzins / 12)) / (1 - Math.pow(1 + (sollzins / 12), -months));
        return rate;
    }
    }



