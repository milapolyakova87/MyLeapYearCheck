import java.util.Scanner;

public class MyLeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи год для проверки:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }

        scanner.close();
    }

    // Метод для проверки, является ли год високосным
    public static boolean isLeapYear(int year) {
        // Условие для високосного года
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
