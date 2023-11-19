package record.player.bootcamp.timetask;

import java.util.Scanner;

/*
Задача 1) Дано время в формате hh:mm. Найдите кратчайший угол между часовой и минутной стрелками на аналоговых часах.

Пример #1
Input 9:00
Output 90
 */
public class TimeTask {
    public static void main(String[] args) {
        // Ввод времени с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input time (hh:mm): ");
        String inputTime = scanner.nextLine();
        scanner.close();

        // Разделение времени на часы и минуты
        String[] timeParts = inputTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Расчет угла между стрелками
        double angle = calculateClockAngle(hours, minutes);

        // Вывод результата
        System.out.println("Output: " + angle);

    }
    private static double calculateClockAngle(int hours, int minutes) {
        // Проверка валидности введенного времени
        if (hours < 0 || hours > 12 || minutes < 0 || minutes > 59) {
            System.out.println("Неверный формат времени.");
            System.exit(0);
        }

        // Коррекция часов в 12-часовом формате
        hours = hours % 12;

        // Расчет угла между стрелками
        double hourAngle = 0.5 * (60 * hours + minutes);
        double minuteAngle = 6 * minutes;

        // Нахождение кратчайшего угла
        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(360 - angle, angle);

        return angle;
    }
}
