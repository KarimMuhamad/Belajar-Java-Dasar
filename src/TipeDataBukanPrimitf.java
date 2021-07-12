public class TipeDataBukanPrimitf {
    public static void main(String[] args) {
        Byte iniByte = 120;
        Integer iniInteger; // Null
        iniInteger = 5;
        Character c = 'C';
        String sapa = "Haii";
        Long iniLong = 10L;
        Boolean benar = true;

        // Konversi
        int age = 30;

        Integer ageObject = age;

        int ageAgain = ageObject;

       short shortAge = ageObject.shortValue();
       byte byteAge = ageObject.byteValue();

       Integer ageIntegerAgain = (int) shortAge;
    }
}
