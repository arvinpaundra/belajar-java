public class AplikasiTodolist {

  public static String[] model = new String[10];

  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    viewShowTodoList();
  }

  /**
   * Menampilkan todo list
   */
  public static void showTodoList() {
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];

      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }
  }

  public static void testShowTodoList() {
    model[0] = "Belajar Dasar Java";
    model[1] = "Studi Kasus Java Dasar: Aplikasi Todolist";

    showTodoList();
  }

  /**
   * Menambahkan todo list
   */
  public static void addTodoList(String todo) {
    // cek apakah model penuh
    var isFull = true;

    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        // model masih ada yang kosong
        isFull = false;
        break;
      }
    }

    // jika penuh, resize ukuran array model 2x lipat
    if (isFull) {
      var temp = model;
      model = new String[model.length * 2];

      for (var i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    // tambahkan data todo pada posisi element bernilai null pada array model
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
        break;
      }
    }
  }

  public static void testAddTodoList() {
    for (var i = 0; i < 25; i++) {
      addTodoList("Contoh Todo ke-" + i);
    }

    showTodoList();
  }

  /**
   * Menghapus todo list
   */
  public static boolean removeTodoList(Integer number) {
    if ((number - 1) >= model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (var i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }

  public static void testRemoveTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    addTodoList("Lima");

    var result = removeTodoList(20);
    System.out.println(result);

    result = removeTodoList(7);
    System.out.println(result);

    result = removeTodoList(2);
    System.out.println(result);

    showTodoList();
  }

  public static String input(String info) {
    System.out.print(info + " : ");
    String data = scanner.nextLine();
    return data;
  }

  public static void testInput() {
    var name = input("Name");
    System.out.println("Hi, " + name);

    var role = input("Role");
    System.out.println("Your role is " + role);
  }

  /**
   * Menampilkan view todo list
   */
  public static void viewShowTodoList() {
    while (true) {
      System.out.println("TODOLIST");

      showTodoList();

      System.out.println("MENU");
      System.out.println("1. Tambah Todolist");
      System.out.println("2. Hapus Todolist");
      System.out.println("x. Keluar");

      var input = input("Pilih");

      if (input.equals("1")) {
        viewAddTodoList();
      } else if (input.equals("2")) {
        viewRemoveTodoList();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak tersedia. ");
      }
    }
  }

  public static void testViewShowTodolist() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    addTodoList("Lima");

    viewShowTodoList();
  }

  /**
   * Menampilkan view tambah todo list
   */
  public static void viewAddTodoList() {
    System.out.println("MENAMBAH TODOLIST");

    var todo = input("Todo (x Jika Batal)");

    if (todo.equals("x")) {
      // batal
    } else {
      addTodoList(todo);
    }
  }

  public static void testViewAddTodolist() {
    addTodoList("Satu");
    addTodoList("Dua");

    viewAddTodoList();

    showTodoList();
  }

  /**
   * Menampilkan view hapus todo list
   */
  public static void viewRemoveTodoList() {
    System.out.println("MENGHAPUS TODOLIST");

    var number = input("Nomor yang dihapus (x Jika Batal)");

    if (number.equals("x")) {
      // batal
    } else {
      var success = removeTodoList(Integer.valueOf(number));

      if (!success) {
        System.out.println("Gagal menghapus todolist: " + number);
      }
    }
  }

  public static void testViewRemoveTodolist() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");

    showTodoList();

    viewRemoveTodoList();

    showTodoList();
  }
}