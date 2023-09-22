public class TipeDataNumber {
  public static void main(String[] args) {
    // INTEGER NUMBER -> zero value is 0
    // -128 -> 127 with size 1 byte
    byte inByte = 100;

    // -32,768 -> 32,767 with size 2 byte
    short iniShort = 1000;

    // -2,147,483,648 -> 2,147,483,647 with size 4 byte
    int iniInt = 10000000;

    // -9x10^18 -> 9x10^18 with size 8 byte
    long iniLong = 1000000000;
    // alternative of long
    long iniLong2 = 1000000000L;

    // FLOATING POINT NUMBER -> zero value is 0.0
    // size 4 byte
    float iniFloat = 10.10F;

    // size 8 byte
    double iniDouble = 10.10;

    // KODE LITERAL
    // common decimal
    int decimalInt = 26;

    // hexadecimal with prefix 0x
    int hexadecimal = 0xFFFFFF;

    // binary with prefix 0b
    int binary = 0b101010;
  }
}
