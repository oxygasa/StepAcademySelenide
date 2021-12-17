package java_fundamentals.lessons.OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Human {
    String name;
    String lastName;
    String type;
    String value;

    public void Input(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    int age;

    Human(String name, String lastName, int age) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + age;
    }

    @Override
    public int hashCode() {
        return name.length() + age;
    }


    public String getValue() {
        String value = "utf-8";
        return value;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Human person1 = new Human("John", "Travolta", 66);
        Human person2 = new Human("Dimitri", "Samasiuk", 66);
        ArrayList<String> listOfPeople = new ArrayList();
        listOfPeople.add(person1.name + " " + person1.lastName);
        listOfPeople.add("John Travolta");
        listOfPeople.remove("John Travolta");
        listOfPeople.add("Dimitri Samasiuk");
        int a = 54;
        listOfPeople.add(String.valueOf(a));
        System.out.println(listOfPeople);

        Set set = new HashSet();
        set.add("aetqwgjk");
        set.add("dqwttwgas");
        set.add("aeqwtgjk");
        set.add("dqgas");
        set.add("aetqewgjk");
        set.add("dgatqws");

        System.out.println(set);

        Map<String, String> map = new HashMap();
        map.put("1", "5");
        map.put("2", "5");
        map.put("3", "5");
        System.out.println(map);

        ArrayList<String> list = new ArrayList();
        list.add(person2.name);
        list.add(person1.name);
        System.out.println(set);
        boolean isSetEqualMap = set.equals(map);
        System.out.println(isSetEqualMap);
        File file = new File("c:/path/a.txt");
        FileInputStream input = new FileInputStream(file);
        System.out.println(file.getName());
        System.out.println(input);
        Set<Integer> set1 = new HashSet();
        Set<String> set2 = new HashSet();
        set2.add("123");
        set2.add("123");
        set2.add("125");
        set2.add("123");
        System.out.println(set2);


        ArrayList<Human> list2 = new ArrayList();
        list2.add(person1);
        list2.add(person2);
        System.out.println(list2);

    }
}