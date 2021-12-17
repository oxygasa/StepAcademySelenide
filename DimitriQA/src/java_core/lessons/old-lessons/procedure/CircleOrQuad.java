package java_fundamentals.lessons.procedure;
import java.util.Scanner;

public class CircleOrQuad {
    private static double quadSquare;
    private static double circleSquare;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Напишите круг или квадрат.");
            String shape = scanner.nextLine();
            if (shape.equalsIgnoreCase("квадрат")) {
                System.out.println("Напишите длину стороны квадрата в сантиметрах");
                quadSquare(scanner.nextDouble());
                System.out.println("Площадь квадрата равна " + quadSquare);
            } else {
                if (shape.equalsIgnoreCase("круг")) {
                    System.out.println("Напишите радиус круга в сантиметрах");
                    circleSquare(scanner.nextDouble());
                    System.out.println(circleSquare);
                }
            }
        }
    }

    public static double quadSquare(double quadLength) {
        quadSquare = quadLength * 4;
        return quadSquare;
    }

    public static double circleSquare(double circleRadius) {
        circleSquare = circleRadius * circleRadius * Math.PI;
        return circleSquare;
    }
}
