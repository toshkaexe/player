package record.player.bootcamp.zodiac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ZodiacFinder {
    public static void main(String[] args) {
        // Пример входной строки
        String inputDate = "19.02.1452";

        // Формат даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            // Преобразование строки в объект Date
            Date date = dateFormat.parse(inputDate);

            // Извлечение дня и месяца из объекта Date
            SimpleDateFormat dayMonthFormat = new SimpleDateFormat("dd.MM");
            String dayMonth = dayMonthFormat.format(date);

            // Определение знака зодиака
            String zodiacSign = getZodiacSign(dayMonth);
            System.out.println("Знак зодиака для дня " + inputDate + ": " + zodiacSign);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты.");
            e.printStackTrace();
        }
    }

    private static String getZodiacSign(String dayMonth) {
        Map<String, String[]> zodiacIntervals = new HashMap<>();
        zodiacIntervals.put("Водолей", new String[]{"21.01", "19.02"});
        zodiacIntervals.put("Рыбы", new String[]{"20.02", "20.03"});
        zodiacIntervals.put("Овен", new String[]{"21.03", "20.04"});
        zodiacIntervals.put("Телец", new String[]{"21.04", "21.05"});
        zodiacIntervals.put("Близнецы", new String[]{"22.05", "21.06"});
        zodiacIntervals.put("Рак", new String[]{"22.06", "22.07"});
        zodiacIntervals.put("Лев", new String[]{"23.07", "21.08"});
        zodiacIntervals.put("Дева", new String[]{"22.08", "23.09"});
        zodiacIntervals.put("Весы", new String[]{"24.09", "23.10"});
        zodiacIntervals.put("Скорпион", new String[]{"24.10", "22.11"});
        zodiacIntervals.put("Стрелец", new String[]{"23.11", "22.12"});
        zodiacIntervals.put("Козерог", new String[]{"23.12", "20.01"});

        for (Map.Entry<String, String[]> entry : zodiacIntervals.entrySet()) {
            String zodiacSign = entry.getKey();
            String[] interval = entry.getValue();
            if (isDateInInterval(dayMonth, interval)) {
                return zodiacSign;
            }
        }

        return "Не удалось определить знак зодиака.";
    }

    // Метод для проверки, находится ли дата в указанном интервале
    private static boolean isDateInInterval(String dayMonth, String[] interval) {
        String start = interval[0];
        String end = interval[1];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");

        try {
            Date startDate = dateFormat.parse(start);
            Date endDate = dateFormat.parse(end);
            Date targetDate = dateFormat.parse(dayMonth);

            return targetDate.compareTo(startDate) >= 0 && targetDate.compareTo(endDate) <= 0;
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты.");
            e.printStackTrace();
            return false;
        }
    }
}
