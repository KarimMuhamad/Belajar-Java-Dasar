public class Looping {
    public static void main(String[] args) {
        // Looping Forever
        //for (;;) {
        //  System.out.println("Tak Terhentikan");
        //}
        var c = 0;
        for (;true;c++) {
            System.out.println(c);
            if(c == 12) {
                break;
            }
        }

        int[] a = {
          1,2,3,4,5,6,7,12,31,2,4,5,6
        };

        for (int i=0; i < a.length; i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(a[i]);
        };

        //Foreach Untuk Array;
        for (var l : a) {
            if (l == 3) {
                continue;
            }
            System.out.println(l);
        }

        var j = 0;
        while (j < a.length) {
            System.out.println("\narray ke " + j + " adalah " + a[j]);
            j++;
        };

        var op = 90;
        var k = 0;

        do {
            System.out.println(op);
            op--;
        } while (op > k);
    }
}
