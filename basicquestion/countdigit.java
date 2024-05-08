public class countdigit {
  public static void main(String[] args) {
    int a = 1231;
    noofdigit(a);
  }

  static void noofdigit(int a) {
    int count = 0;
    while (a >= 0) {
      a = a / 10;
      count++;
      if (a == 0) {
        System.out.println(count);
        return;

      }

    }
  }
}
