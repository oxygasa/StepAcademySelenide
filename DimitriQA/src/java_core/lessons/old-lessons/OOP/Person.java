package java_fundamentals.lessons.OOP;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    Car car;

    Person() {
    }

    Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public void getInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Модель машины: " + car.model + ", Цвет машины: " + car.color + ", Год производства машины: " + car.yearOfProduce);
    }
}

class Car {
    String model;
    String color;
    int yearOfProduce;

    Car() {
    }

    Car(String model, String color, int yearOfProduce) {
        this.model = model;
        this.color = color;
        this.yearOfProduce = yearOfProduce;
    }

}


class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Дмитрий", 30, new Car("Жигули", "Желтый", 1987));
        Person person2 = new Person("Наталья", 18, new Car("Победа", "Синий", 1930));
        Person person3 = new Person("Анна", 40, new Car("Субару", "Зеленый", 1995));
        Person person4 = new Person("Саша", 24, new Car("БМВ", "Черный", 2015));
        Person person5 = new Person("Алексей", 12, new Car("Мерседес", "Белый", 2013));
        Person person6 = new Person();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Хотите создать новую персону? Напишите да или нет.");
            String userType = scanner.nextLine();
            if (userType.equalsIgnoreCase("да")) {
                person6.car = new Car();
                System.out.println("Введите имя: ");
                person6.name = scanner.nextLine();
                System.out.println("Введите возраст: ");
                person6.age = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите модель машины: ");
                person6.car.model = scanner.nextLine();
                System.out.println("Ввежите цвет машины: ");
                person6.car.color = scanner.nextLine();
                System.out.println("Введите год выпуска: ");
                person6.car.yearOfProduce = scanner.nextInt();
                person6.getInfo();
                person1.getInfo();
                person2.getInfo();
                person3.getInfo();
                person4.getInfo();
                person5.getInfo();

            } else {
                person1.getInfo();
                person2.getInfo();
                person3.getInfo();
                person4.getInfo();
                person5.getInfo();
            }
        }
    }
}

