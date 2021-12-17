package java_fundamentals.lessons.procedure;
import java.util.Scanner;

public class Returns {
    private static String e;

    public static void main(String[] args) {
       while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Введи целое число, Наталья: ");
           number(scanner.nextInt());
           System.out.println(e);
       }
    }

    public static String number(int a) {
        if (a > 0) {
            e = "Положительное число";
        } else {
            if (a == 0) {
                e = "Ноль";
            } else {
                e = "Отрицательное число";
            }
        }

        return e;
    }

}
