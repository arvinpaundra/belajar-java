public class KonversiNumber {
  public static void main(String[] args) {
    // Widening Casting -> from shortest length to largest length (automaticaly)
    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;

    // Narrowing Casting -> from largest length to shortest length (handle manually)
    byte iniByte2 = (byte) iniInt;
    short iniShort2 = (short) iniInt;
  }
}
