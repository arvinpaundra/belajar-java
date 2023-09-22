public class Array {
  public static void main(String[] args) {
    // array declaration with specified length
    String[] stringArray = new String[3];
    stringArray[0] = "Arvin";
    stringArray[1] = "Paundra";
    stringArray[2] = "Ardana";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    // alternative ways to define array with dynamic size in java
    int[] arrayInt = new int[]{
      1, 2, 3, 4, 5
    };

    // or
    long[] arrayLong = {
      10L, 20L, 30L
    };
  }
}
