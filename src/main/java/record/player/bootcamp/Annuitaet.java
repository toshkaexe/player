package record.player.bootcamp;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Annuitaet {
    public static void main(String[] args) {
        double darlehensbetrag = 100000; // Beispielbetrag
        double sollzins = 2.12; // Beispielzins in Prozent
        double tilgung = 2; // Beispieltilgung in Prozent
        int zinsbindung = 10; // Beispiel-Zinsbindung in Jahren

        generateTilgungsplan(darlehensbetrag, sollzins, tilgung, zinsbindung);
    }

    public static void generateTilgungsplan(double darlehensbetrag, double sollzins, double tilgung, int zinsbindung) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        double restschuld = darlehensbetrag;
        double gesamtzinsen = 0;
        double gesamttilgung = 0;


        System.out.println("Datum\t\t\t\tRestschuld\t\t\tZinsen\t\t\tTilgung\t\t\tRate");


        for (int i = 0; i < zinsbindung * 12; i++) {
            Date date = new Date(); // Startdatum - aktuelles Datum
            date.setMonth(date.getMonth() + i);




            double zinsen = (sollzins / 100) * (restschuld / 12);

            double tilgungsbetrag = (tilgung / 100) * restschuld / 12;
            double rate = zinsen + tilgungsbetrag;


            gesamtzinsen += zinsen;
            gesamttilgung += tilgungsbetrag;

            restschuld -= tilgungsbetrag;

            System.out.println(String.format("%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t%s",
                     dateFormat.format(date),
                    decimalFormat.format(restschuld),
                    decimalFormat.format(zinsen),
                    decimalFormat.format(tilgungsbetrag),
                    decimalFormat.format(rate)));
        }

        System.out.println(String.format("Zinsbindungsende\t%s\t\t\t%s\t\t%s\t\t%s",
                decimalFormat.format(restschuld),
                decimalFormat.format(gesamtzinsen),
                decimalFormat.format(gesamttilgung),
                decimalFormat.format(gesamtzinsen + gesamttilgung)));
    }


}
