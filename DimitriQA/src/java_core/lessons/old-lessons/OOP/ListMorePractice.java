package java_fundamentals.lessons.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMorePractice {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(90);
            numbers.add(a);
            numbers.set(i,a/3);
        }
        System.out.println(numbers);
    }

}
