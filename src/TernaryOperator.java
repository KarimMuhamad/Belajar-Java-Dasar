public class TernaryOperator {
    public static void main(String[] args) {
        int nilai = 75;
        String word;

        //Tanpa Ternary
        if (nilai >= 75) {
            word = "Anda Lulus";
        } else {
            word = "Anda Tidak Lulus";
        }

        System.out.println(word);

        //Dengan Ternary
        word = nilai >= 75 ? "Lulus" : "Tidak Lulus";

        System.out.println(word);
    }
}
