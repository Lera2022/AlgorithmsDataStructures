public class app {
  public static void main(String[] args) {
    // int n = 100;

    // int count = 0;

    // for (int i = 0; i < n; i++) {
    // // count++;
    // // do it f(n)
    // foo(n / 5);
    // }

    // for (int index = 0; index < Math.pow(2, n); index++) {

    // }

    // for (int j = 0; j < n / 2; j++) {
    // // do it g(n)
    // }

    // // for (int i = 0; i < n * n; i++) {

    // // }

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n / 5; j++) {
    // // do it g(n)
    // }
    // }

    for (int n = 0; n < 400; n++) {

      int s = 0;
      for (int j = 1; j <= n; j++) {
        s += 1;
        j = j * 2;
      }
      System.out.println("n = " + n + " всего:" + s);
    }

    // static void foo(int count) {
    // for (int i = 0; i < count / 5; i++) {
    // //
    // }
    // for (int i = 0; i < count / 5; i++) {
    // //
    // }
    // for (int i = 0; i < count / 5; i++) {
    // //
    // }
    // for (int i = 0; i < count / 5; i++) {
    // //
    // }
    // for (int i = 0; i < count / 5; i++) {
    // //
    // }
    // }

  }
}