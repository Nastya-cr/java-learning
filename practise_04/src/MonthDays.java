import java.util.Scanner;

public class MonthDays {
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] months = {
                "январь", "февраль", "март", "апрель",
                "май", "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь", "декабрь"
        };

        int[] dom = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };


        System.out.print("Введите номер месяца от 1 до 12: ");

        if (!input.hasNextInt()) {
            System.out.println("Нужно ввести целое число");
            return;
        }

        int month = input.nextInt();

        try {
            int days = dom[month - 1];

            if (month == 2) {
                System.out.print("Введите год: ");
                int year = input.nextInt();

                if (isLeapYear(year)) {
                    days = 29;
                }
            }

            System.out.println("Месяц: " + months[month - 1]);
            System.out.println("Количество дней: " + days);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }
}
