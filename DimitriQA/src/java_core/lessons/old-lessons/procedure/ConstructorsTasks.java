package java_fundamentals.lessons.procedure;
public class ConstructorsTasks {
    public static void main(String[] args) {
        sum(1, 34);
        sum(124, 1245, 1254, 125, "eee");
        sum(125, 125, 125, 215, 215, 215, 125, 125, 215, 125, 215, 215, 125, 215, 215, 215);
        sum(1223, 123, 123, 123, "124swfa");
        sum(one(), three(), two(), one(), three());
    }

    public static int sum(int a, int b) {
        System.out.println("Result of public static int sum (int a, int b): ");
        System.out.println(a + b);
        System.out.println();
        return a + b;
    }

    public static String sum(int a, int b, int c, int d, String e) {
        System.out.println("Result of public static String sum (int a, int b, int c, int d, String e): ");
        String solution;
        solution = a - b + c * d + e;
        System.out.println(solution);
        System.out.println();
        return solution;
    }

    public static void sum(int... a) {
        System.out.println("Result of public static void sum (int...a): ");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println();
    }

    public static int one() {
        System.out.println(" used \"one\". ");
        return 1;
    }

    public static int two() {
        System.out.println(" used \"two\". ");
        return 2;
    }

    public static int three() {
        System.out.println(" used \"three\". ");
        return 3;
    }
}
