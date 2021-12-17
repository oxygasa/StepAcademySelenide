package java_fundamentals.lessons.OOP;

import java.util.*;

public class MapCollection {
    //Map в коллекции нужен, чтобы представлять в Jav-e объекты "а-ля" как в JSON в js.
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        set.add("Вышивает крестиком");
        set1.add("Поет на эстраде");
        set.add("Готовит как шеф");

        Human human = new Human("Виктор", "Зданевич", 25);
        Human human1 = new Human("Наталья", "Кондратова", 18);
        Human human2  = new Human("John","Dean",125);
        Map<Human, Set<String>> map = new HashMap<>();
        map.put(human, set);
        map.put(human1, set1);
        map.put(human2, new HashSet<String>(Arrays.asList(new String[]{"qqq","qwe","dgs"})));
        System.out.println(map);
    }
}
