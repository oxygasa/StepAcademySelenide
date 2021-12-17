package java_fundamentals.practice.task1;

public class CalculatorTest {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        double one;
        double two;
        int three;

        System.out.println("Ввведите первое число: ");
        one = readClass.readNextDouble();
        System.out.println("Введите второе число: ");
        two = readClass.readNextDouble();
        System.out.println("Введите количество знаков после запятой: ");
        three = (int) readClass.readNextDouble();
        Calculator calculator = new Calculator(one, two, three);


        System.out.println("Выберите действие");
        System.out.println("1. Сложить");
        System.out.println("2. Вычесть");
        System.out.println("3. Умножить");
        System.out.println("4. Разделить");
        System.out.println("0. Выход");
        System.out.println("Введите номер пункта");
        int action = (int) readClass.readNextDouble();
        switch (action) {
            case 1:
                System.out.println(calculator.add(one, two));
                break;
            case 2:
                System.out.println(calculator.subtract(one, two));
                break;
            case 3:
                System.out.println(calculator.multiply(one, two));
                break;
            case 4:
                System.out.println(calculator.divide(one, two));
                break;
            case 0:
                break;
            default:
                System.out.println("Вы выбрали неверный путь");
        }
    }
}