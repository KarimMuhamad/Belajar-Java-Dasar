public class Method {
    public static void main(String[] args) {
        sayHello();
        sayHai("Ezio", "Auditore");
        sayHai();
        sayHai("LPM");
        System.out.println(sum(2,2));

        int[] nilai = {50,64,52,73,82,90,43};

        System.out.println(avg(nilai));
        System.out.println(avg(4,2,3,4,2,3,4,5,6,7,9,5,6,6,5,202,12));
        System.out.println(factLoop(2));
        System.out.println(fact(5));
        stack(100);
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHai(String firstname, String lastName) {
        System.out.println("Hai" + firstname + lastName);
    }

    static void sayHai() {
        System.out.println("Hai");
    }

    static void sayHai(String a) {
        System.out.println("Hai " + a);
    }

    static int sum(int a,int b) {
        var total = a + b;
        return total;
    }

    static int avg(int... nilai) {
        int total = 0;
        for (var value : nilai) {
            total += value;
        }

        int finalValue = total / nilai.length;

        return finalValue;
    }

    static int factLoop(int x) {
        var total = 1;
        for (var i = 1; i <= x; i++ ) {
            total *= i;
        }

        return total;
    }

    static int fact(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * fact(value - 1);
        }
    }

    // Error StackOverflow
    static void stack(int y) {
        if (y == 0) {
            System.out.println("0");
        } else {
            System.out.println("Looping - " + y);
            stack(y - 1);
        }
    }
}
