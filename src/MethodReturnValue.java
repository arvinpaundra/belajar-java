public class MethodReturnValue {

  public static void main(String[] args) {
    var jumlah = sum(100, 100);
    System.out.println(jumlah);

    System.out.println(sum(200, 200));

    var tambah = hitung(100, "+", 100);
    System.out.println(tambah);

    var kurang = hitung(200, "-", 100);
    System.out.println(kurang);
  }

  static int sum(int value1, int value2) {
    var total = value1 + value2;
    return total;
  }

  static int hitung(int value1, String operasi, int value2) {
    switch (operasi) {
      case "+":
        return value1 + value2;
      case "-":
        return value1 - value2;
      default:
        return 0;
    }
  }
}
