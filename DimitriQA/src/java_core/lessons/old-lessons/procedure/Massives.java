package java_fundamentals.lessons.procedure;

import java.util.Arrays;
import java.util.Random;

public class Massives {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100 + 50) - 50;

        }
//Предварительная подготовка. Сделать рандомный массив.
        System.out.println("Предварительная подготовка. Внешний вид массива => " + Arrays.toString(array1));

//Задача № 1. Старт. Написать индексы только чётных элементов массива.

        int[] array2 = new int[20];
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] % 2 == 0) {
                array2[j] = j;
            }
        }
        System.out.println("Результат задания №1. Индексы четных элементов массива таковы => " + Arrays.toString(array2));

//Задача № 2. Старт. Найти среднее арифметическое только положительных элементов массива.
        int sum = 0;
        for (int k = 0; k < array1.length; k++) {
            if (array1[k] > 0) {
                array2[k] = array1[k];
                sum += array2[k];
            }
        }
        double average = 0;
        average = (double) sum / array1.length;
        System.out.println("Результат задания №2. Среднее арифметическое положительных элементов массива - это => " + average);

//Задача №3. Старт. Найти макисмальный отрицательный элемент массива.

        int min = array1[0];
int l;
        for (l = 0; l < array1.length; l++) {
            if (array1[l] < min) {
                min = array1[l];
                break;
            } else {
                l++;
            }
        }

        System.out.println("Результат задания №3. Максимально отрицательный элемент массива - это => " + min + ", а его позиция в массиве - это =>" + l);

//Задача №4. Старт. Найти макисмальный положительный элемент массива и его индекс.

        int max = array1[0];
        int m;
        for (m = 0; m < array1.length; m++) {
            if (array1[m] > max) {
                max = array1[m];
                break;
            } else {
                m++;
            }
        }
        System.out.println("Результат задания №4. Максимально положительный элемент массива - это => " + max + ", а его индекс равен " + m);


//Задача №5 Старт. Поменять местами минимальный и максимальный элементы.
        for (int n = 0; n < array1.length; n++) {
            array2[n] = array1[n];
        }
        int maxIndex = 0, minIndex = 0;
        for (int index = 1; index < array1.length; index++) {
            if (array1[index] > max) {
                max = array1[index];
                maxIndex = index;
            }
            if (array1[index] < min) {
                min = array1[index];
                minIndex = index;
            }
        }
        array1[maxIndex] = min;
        array1[minIndex] = max;
        System.out.println("Результат задания № 5 со сменой местами минимальных и максимальных значений таков => " + Arrays.toString(array1));

//Задача №6. Старт. Сдвинуть элементы массива в указанном направлении влево или вправо на указанное число шагов.

        int k = 3;
        int n = 12;
        //Создал два массива, вывел
        //Один с нулями, второй - случ. числами
        int [] mas = new int [n];
        int [] mas1 = new int [n+k];
        System.out.println();
        System.out.println("Задание №6. Заполняем первый массив случайными числами");
        for (int i = 0; i < mas.length; i++){
            mas [i] = (int)(Math.random()*30);
            System.out.format("%3d", mas [i]);
        }
        System.out.println();
        System.out.println("Смещаем массив вправо на k элементов");
        for (int i = 0; i < mas.length; i++){
            mas1 [i+k] = mas[i];
            mas[i] = mas1[i];
            System.out.format("%3d", mas [i]);
        }
        System.out.println();
        System.out.println("Снова заполняем первый массив случайными числами");
        for (int i = 0; i < mas.length; i++){
            mas [i] = (int)(Math.random()*45);
            System.out.format("%3d", mas [i]);
        }

        System.out.println();
        System.out.println("Смещаем массив влево на k элементов");
        for (int q = 0; q < mas.length; q++){
            mas1 [k] = mas[q];
            mas[q] = mas1[q];
            System.out.format("%3d", mas [q]);
        }
    }
}