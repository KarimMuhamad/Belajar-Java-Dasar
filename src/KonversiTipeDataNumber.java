public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 127;
        short iniShort = iniByte;
        int iniInteger = iniShort;

        int iniInteger2 = 130;
        byte iniByte2 = (byte) iniInteger2;
        byte iniByte3 = (byte) iniInteger;
        System.out.println(iniByte2);
        System.out.println(iniByte3);
    }
}
