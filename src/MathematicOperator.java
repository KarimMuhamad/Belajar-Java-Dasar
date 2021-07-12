public class MathematicOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Asigment Operator
        int c = 10;
        c += 10;
        System.out.println(c);

        // Unary Operatot
        int d = +15;
        int e = -5;

        d++;
        e--;

        System.out.println(d);
        System.out.println(e);
        System.out.println(!true);
    }
}
