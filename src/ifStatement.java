public class ifStatement {
    public static void main(String[] args) {

        var nilai = 68;
        var absen = 90;
        String indexNilai;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Lulus");
        } else if (nilai <= 60) {
            System.out.println("Anda kurang orang dalam");
        } else {
            System.out.println("Dahlah");
        }

        if (nilai > 80) {
            indexNilai = "A";
        } else if (nilai > 70 && nilai <= 80) {
            indexNilai = "AB";
        } else if (nilai > 65 && nilai <= 70) {
            indexNilai = "B";
        } else if (nilai > 60 && nilai <= 65) {
            indexNilai = "BC";
        } else if (nilai > 50 && nilai <= 65) {
            indexNilai = "C";
        } else if (nilai > 40 && nilai <= 50) {
            indexNilai = "D";
        } else  {
            indexNilai = "E";
        }

        switch (indexNilai) {
            case "A" :
                System.out.println("Anda Lulus dengan Nilai Wow");
                break;
            case "B" :
            case "C" :
                System.out.println("Anda Lulus dengan Nilai Baguslah");
                break;
            case  "D" :
                System.out.println("Sekali Lagi anda Mungkin Kurang Orang Dalam");
                break;
            default:
                System.out.println("Kalo ini sih kayanya anda salah jurusan deh");
        }

        System.out.println();
        System.out.println("Switch Case Lambda Java 14");
        switch (indexNilai) {
            case  "A" -> System.out.println("Ini dengan Switch Lambda");
            case  "B", "C" -> System.out.println("Ini dengan Switch Lambda");
            case  "D" -> System.out.println("Ini dengan Switch Lambda");
            default -> {
                System.out.println("Ini dengan Switch Lambda");
                System.out.println("Pakai Block");
            }
        }

        System.out.println();
        System.out.println("Kata Kunci Yield");

        var ucapan = switch (indexNilai) {
            case "A" :
                yield "Anak Rajin";
            case "B", "C" :
                yield "Rajin Dikit";
            case "D" :
                yield "Kurang Perhatian & Kasih Sayang";
            default:
                yield "Broken Home :(";
        };

        System.out.println(ucapan);

    }
}
