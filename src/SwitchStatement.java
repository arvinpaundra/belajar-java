public class SwitchStatement {
  public static void main(String[] args) {
    var nilai = "A";

    switch (nilai) {
      case "A":
        System.out.println("Anda lulus dengan baik");
        break;
      case "B":
      case "C":
        System.out.println("Anda lulus dengan cukup baik");
        break;
      case "D":
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Anda mungkin salah jurusan");
    }

    // Switch Lamda -> no need keyword "break"
    switch (nilai) {
      case "A" -> System.out.println("Anda lulus dengan baik");
      case "B", "C" -> System.out.println("Anda lulus dengan cukup baik");
      case "D" -> System.out.println("Anda tidak lulus");
      default -> {
        System.out.println("Anda mungkin salah jurusan");
      }
    }

    // Switch using yield
    String ucapan = switch (nilai) {
      case "A":
        yield "Anda lulus dengan baik";
      case "B", "C":
        yield "Anda lulus dengan cukup baik";
      case "D":
        yield "Anda tidak lulus";
      default:
        yield "Anda mungkin salah jurusan";
    };

    System.out.println(ucapan);
  }

}
