package java_fundamentals.lessons.procedure;
import java.util.Arrays;
import java.util.Random;

public class MinMaxInArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array1 = new int[5][5];
        System.out.println("Результат задания №1: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = random.nextInt(100 + 50) - 50;
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(" ");
        }
        int maxValue = array1[0][0];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i][j] > maxValue) {
                    maxValue = array1[i][j];
                }
            }
        }
        System.out.println("\nРезультат задания №2: Максимальное число в массиве - это => " + maxValue);

        int diagonalSum = 0;
        for (int i = array1.length - 1; i > 0; i--) {
            for (int j = 0; j < array1.length; j++) {
                diagonalSum = diagonalSum + array1[i][j];
            }
        }
        System.out.println("\nРезультат задания №3 =>" + diagonalSum);

        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] array3 = new int[9];
        int k = 0;
        int array3Decs = 0;
        System.out.println("Результат задания №4:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array3[k] = array2[i][j];
                array3Decs = array3[k];
                k++;
                System.out.print(array3Decs + " ");
            }
        }
        int[][] tenzor = new int[5][5];
        System.out.println("\nУсловие задания №5 => ");
        int[] array4 = new int[tenzor.length * tenzor[0].length];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                tenzor[i][j] = random.nextInt(10);
                System.out.print(tenzor[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nРезультат задания №5 => ");
        for (int[] ints : tenzor) {
            for (int j = 0; j < tenzor.length; j++) {
                array4[k] = ints[j];
                System.out.print(array4[k] + " ");
            }
        }

//Задание №6. Старт. Найти минимальное значение в каждой строчке.

        for (int i = 0; i < array1.length; i++) {
            int minValue = array1[i][0];
            for (int j = 0; j < array1.length; j++) {
                if (array1[i][j] < minValue) {
                    minValue = array1[i][j];
                }

            }
            System.out.println("\nРезультат задания №6: Минимальное число в данной строке - это => " + minValue);
        }

        int[] firstMultiplicator = new int[15];
        firstMultiplicator[0] = 2;
        int[] secondMultiplicator = new int[15];
        secondMultiplicator[0] = 2;
        String[] resultOfMultiplication = new String[15];
        for (int i = 0; i < 15; i++) {
            firstMultiplicator[i] = random.nextInt(7) + 2;
            secondMultiplicator[i] = random.nextInt(7) + 2;
            for (int j = i - 1; j >= 0; j--) {
                if ((firstMultiplicator[i] == firstMultiplicator[j] && secondMultiplicator[i] == secondMultiplicator[j]) || (firstMultiplicator[i] == secondMultiplicator[j]) && firstMultiplicator[j] == secondMultiplicator[i]) {
                    firstMultiplicator[i] = random.nextInt(7) + 2;
                    secondMultiplicator[i] = random.nextInt(7) + 2;
                }
            }
            resultOfMultiplication[i] = firstMultiplicator[i] + " * " + secondMultiplicator[i] + " = " + firstMultiplicator[i] * secondMultiplicator[i] + " ";
        }

            System.out.println(Arrays.toString(resultOfMultiplication));
        
    }
}
