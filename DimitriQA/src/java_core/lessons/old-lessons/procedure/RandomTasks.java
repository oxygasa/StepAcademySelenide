package java_fundamentals.lessons.procedure;
import java.util.Scanner;

public class RandomTasks {
    private static String getResultOfExTwo;
    private static String getResultOfExThree;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание №1: \nВведите любое целое положительное число: ");
        int userNumber = scanner.nextInt();
        int i;
        for (i = 1; i <= userNumber; i++) {
            i += i;
        }
        System.out.println("Результат задания №1: ");
        System.out.print(i);
        for (int j = 7; j <= 98; j++) {
            j += 7;
            getResultOfExTwo = j + " ";
        }
        System.out.println("Результат задания: №2: " + getResultOfExTwo);

        for (int k = 1; k <= 512; k++) {
            k *= 2;
            getResultOfExThree = k + " ";
        }
        System.out.println("Результат задания №3: " + getResultOfExThree);

        System.out.println("Результат задания №4: ");
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 5; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Результат задания №5: ");
        int fibonacciFirst = 1;
        int fibonacciSecond = 1;
        int n2;
        System.out.print(fibonacciFirst + " " + fibonacciSecond + " ");
        for (int n = 3; n <= 21; n++) {
            int getResultOfExFive = fibonacciFirst + fibonacciSecond;
            System.out.print(getResultOfExFive + " ");
            fibonacciFirst = fibonacciSecond;
            fibonacciSecond = getResultOfExFive;
        }


        for (int o = 0; o < 3; o++) {
            System.out.println("\nЗадание №6: Что это такое: синий, большой, металлический и набит зайцами. Есть 3 попытки. Если не можешь ответить, напиши \"Сдаюсь\"");
            String getExSixAnswer = scanner.nextLine();
            if (getExSixAnswer.equalsIgnoreCase("Троллейбус")) {
                System.out.println("Правильно!");
                break;
            } else {
                if (getExSixAnswer.equalsIgnoreCase("Сдаюсь")) {
                    System.out.println("Правильный ответ \"Троллейбус\".");
                    break;
                } else {
                    System.out.println("Попробуй ещё.");
                }
            }
        }

        System.out.println("");
        int n;
        int count = 0;
        System.out.println("Задание №7: введите любое натуральное число и я выведу список натуральных чисел, на которые оно делится: ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.print("Число " + n + " делится на - " );
        for(int q = 1; q <= n; q++){
            if ((n % q) == 0){
                count++;
                System.out.print(q + " ");
            }
        }
        System.out.println("Количество делителей - " + count);

        System.out.println();

        double peopleAtFirstYear = 10000000;
        double coefficientOfBirth = 0.0005714;
        double getResultofPeople = 0;
        double wholePeopleAdd = 0;
        for (int r = 0; r < 10; r++) {
            getResultofPeople = (peopleAtFirstYear * coefficientOfBirth);
        }
        wholePeopleAdd = getResultofPeople + peopleAtFirstYear;

        System.out.println("Результат задания №8 равен: " + wholePeopleAdd);


        System.out.println("Задание №10: введите сумму вклада и будут рассчитаны проценты.");
    double getUserSumType = scanner.nextDouble();
        System.out.println("Введите количество месяцев кредита: ");
    int getCountOfLoansMonthPeriod = scanner.nextInt();
    double calculateMothRate;
    double finalLoanSum = 0;
    for (int s = 0; s <= getCountOfLoansMonthPeriod; s ++) {
        calculateMothRate = getUserSumType * 0.07;
        finalLoanSum = finalLoanSum + calculateMothRate;
    }
        System.out.println("Результат задания №10: сумма кредита одобрена: " + finalLoanSum + " в рублях.");
    }
}