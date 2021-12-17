package java_fundamentals.lessons.OOP;

import java.util.*;

//двумерный массив превратить в одномерный
public class ListCollection {
    public static void main(String[] args) {
        int[][] array = new int[10][8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = i + j;
     //Заполнить массив неуникальными значениями и превратить в массив с уникальными значениями.
                Random random = new Random();
                List<Integer> nonUnique = new ArrayList<>();
                for (int k = 0; k < 100; k++) {
                    nonUnique.add(random.nextInt(10));
                }
            Set set = new HashSet(nonUnique);
                System.out.println(nonUnique);
                System.out.println(set);
            }
        }

        System.out.println(func(array));
    }

    static List<Integer> func(int [][] tenzor){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < tenzor.length; i++) {
            for (int j = 0; j < tenzor[i].length; j++) {
                list.add(tenzor[i][j]);
            }
        }
        return list;
    }
    }