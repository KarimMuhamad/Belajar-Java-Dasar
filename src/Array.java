public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Hai";
        arrayString[1] = "Haii";
        arrayString[2] = "Haiii";

        System.out.println(arrayString[0]);

        arrayString[0] = "LPM";

        System.out.println(arrayString[0]);

        arrayString[0] = null;

        Integer[] Age = new Integer[2];

        int[] arrayInteger = new int[] {
                1,2,3
        };

        Float[] arrayShort = {1.0F,1.2F};

        System.out.println(arrayShort.length);

        int[][] kode = {
                {1,2,3},
                {2,1,4}
        };

        System.out.println(kode);
        System.out.println(kode[0][1]);
    }
}
