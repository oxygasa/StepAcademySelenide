package java_fundamentals.lessons.procedure;
import java.util.Scanner;

public class Homework {
    static int result1;
    static String result2;
    static String result3;
    static int result4;

static String stopProgramWord = "ХВАТИТ";
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 1:\n Введите целое число: ");
            exerciseOne(scanner.nextInt());
            System.out.println("Результат задания 1: " + result1 + "\n-------\n");
            System.out.println("Задание 2:\n Введите 3 целых числа. После каждого числа нажимайте [ENTER]: ");
            exerciseTwo(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("Результат задания 2: " + result2 + "\n-------\n");
            System.out.println("Задание 3:\n Введите 3 числа (разрешены дробные через запятую типа Double). После каждого числа нажимайте [ENTER]: ");
            exerciseThree(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Результат задания 3: " + result3 + "\n--------\n");
            System.out.println("Задание 4:\n Введите 2 целых числа. После каждого числа нажимайте [ENTER]: ");
            exerciseFour(scanner.nextInt(), scanner.nextInt());
            System.out.println("Введите результат умножения этих двух чисел:");
            int userMultiplicationDecision = scanner.nextInt();
            if (userMultiplicationDecision == result4) {
                System.out.println("Вы угадали. Результат умножения будет равен " + result4);
            } else {
                System.out.println("Не совсем так. Результат умножения будет равен " + result4);

            }
            System.out.println("\n Конец программы. Спасибо за внимание!");
        }


    public static void exerciseOne(int numberOne) {
        if (numberOne > 0) {
            result1 = numberOne + 1;
        } else {
            if (numberOne < 0) {
                result1 = numberOne - 2;
            } else {
                result1 = 10;
            }
        }
    }

    public static void exerciseTwo(int numberTwo, int numberThree, int numberFour) {
        String numberTwoString = Integer.toString(numberTwo);
        String numberThreeString = Integer.toString(numberThree);
        String numberFourString = Integer.toString(numberFour);
        String comma = ", ";
        if ((numberTwo > numberThree && numberThree > numberFour) || (numberTwo == numberThree && numberThree == numberFour)) {
            result2 = numberTwoString + comma + numberThreeString + comma + numberFourString;
        } else {
            if (numberTwo < numberThree && numberThree < numberFour) {
                result2 = numberFourString + comma + numberThreeString + comma + numberTwoString;
            } else {
                if (numberTwo > numberThree && numberThree < numberFour) {
                    result2 = numberFourString + comma + numberTwoString + comma + numberThreeString;
                } else {
                    if (numberTwo < numberThree && numberThree > numberFour) {
                        result2 = numberThreeString + comma + numberTwoString + comma + numberFourString;
                    }
                }
            }
        }
    }

    public static void exerciseThree(double numberFive, double numberSix, double numberSeven) {
        String numberFiveString = Double.toString(numberFive);
        String numberSixString = Double.toString(numberSix);
        if ((numberFive > numberSix && numberSix > numberSeven) || (numberFive < numberSix && numberSix < numberSeven || numberSix == numberSeven || numberFive > numberSix)) {
            result3 = numberSixString;
        } else {
            if (numberFive > numberSix && numberSix < numberSeven || numberFive < numberSix && numberSix > numberSeven) {
                result3 = numberSixString;
            } else {
                if (numberFive == numberSix || numberSix < numberSeven) {
                    result3 = numberFiveString;
                }
            }
        }
    }

    public static void exerciseFour(int numberEight, int numberNine) {
        result4 = numberEight * numberNine;
    }
}