package java_fundamentals.lessons.OOP;

import java.util.*;

public class MapMorePractice {
    public static void main(String[] args) {
        Map<String, Double> total = new HashMap<>();
        total.put("Виктор", 24.4);
        total.put("Наталья", 30.24);
        total.put("Анна", 55.24);
        System.out.println("Сумма к оплате каждого покупателя в рублях" + total);
    }
}
