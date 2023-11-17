package record.player.bootcamp;

import java.text.DecimalFormat;

/*
Сумма кредита (S) = 100,000 евро
Процентная ставка в год (r) = 2.3%
Процент погашения (2.0%)

Формула для аннуитетного платежа:
P = S * (r / 12) / (1 - (1 + r / 12)^(-n))

где:
P - ежемесячный платеж
S - сумма кредита
r - годовая процентная ставка
n - количество платежей (в месяцах)

n = 10 лет * 12 месяцев = 120 месяцев
        r = 2.3% годовых = 0.023 в десятичном виде
*/
public class Morgage {

        public static void main(String[] args) {
            double darlehensbetrag = 100000; // Сумма кредита
            double sollzins = 2.12; // Процентная ставка
            double tilgung = 2; // Размер первоначального взноса
            int zinsbindung = 10; // Срок займа в годах

            generateTilgungsplan(darlehensbetrag, sollzins, tilgung, zinsbindung);
        }

        public static void generateTilgungsplan(double darlehensbetrag, double sollzins, double tilgung, int zinsbindung) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

            double restschuld = darlehensbetrag;
            double gesamtzinsen = 0;

            System.out.println("Месяц\t\tДолг\t\tПроценты\t\tТело кредита\t\tЕжемесячный платеж");

            double rate = berechneRate(darlehensbetrag, sollzins, zinsbindung);

            for (int i = 1; i <= zinsbindung * 12; i++) {
                double zinsen = (sollzins / 100) * (restschuld / 12);
                double tilgungsbetrag = rate - zinsen;
                gesamtzinsen += zinsen;
                restschuld -= tilgungsbetrag;

                System.out.println(String.format("%d\t\t%s\t\t%s\t\t%s\t\t%s",
                        i,
                        decimalFormat.format(restschuld),
                        decimalFormat.format(zinsen),
                        decimalFormat.format(tilgungsbetrag),
                        decimalFormat.format(rate)));
            }
        }

        public static double berechneRate(double darlehensbetrag, double sollzins, int zinsbindung) {
            double rate;
            double zinssatzMonatlich = (sollzins / 100) / 12;
            int monate = zinsbindung * 12;

            rate = (darlehensbetrag * zinssatzMonatlich) / (1 - Math.pow(1 + zinssatzMonatlich, -monate));

            return rate;
        }

}

