package java_fundamentals.practice.task2;

public class Shape {


}

class Square extends Shape {
    public int getSquareResult(int lengthOfSquare) {
        return lengthOfSquare * 4;
    }
}

class Circle extends Shape {
    public int getSquareResult(int radius) {
        double pi = Math.PI;
        return (int) (radius * radius * pi);
    }

}

class ProgramLauncherForShapes {
    public static void main(String[] args) {
        Square square = new Square();
        int quadransSquareResult = square.getSquareResult(214);
        Circle circle = new Circle();
        int cicrleSquareResult = circle.getSquareResult(125);
        System.out.println("Площадь квадрата равна " + quadransSquareResult + ", а площадь круга равна " + cicrleSquareResult);
    }
}
