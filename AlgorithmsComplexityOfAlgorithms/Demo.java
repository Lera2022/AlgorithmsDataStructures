import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo {

  public static void main(String[] args) {
    // List<Integer> availableDivider = findAvailableDivider(12);
    // for (Integer integer : availableDivider) {
    // System.out.println(integer);
    // }
    AtomicInteger counter = new AtomicInteger(0);
    int fib = fib2(10, counter);
    System.out.println("Fib number" + fib);
    System.out.println("Counter: " + counter.get());

    counter = new AtomicInteger(0);
    fib = fib2(11, counter);
    System.out.println("Fib number" + fib);
    System.out.println("Counter: " + counter.get());

    counter = new AtomicInteger(0);
    fib = fib2(12, counter);
    System.out.println("Fib number" + fib);
    System.out.println("Counter: " + counter.get());
    
    counter = new AtomicInteger(0);
    fib = fib2(13h, counter);
    System.out.println("Fib number" + fib);
    System.out.println("Counter: " + counter.get());
  }

  public static List<Integer> findAvailableDivider(int number) {
    int counter = 0;
    List<Integer> result = new ArrayList<>();
    for (int i = 1; i <= number; i++) {
      counter++;
      if (number % i == 0) {
        result.add(i);
      }
    }
    System.out.println("Counter: " + counter);
    return result;
  }

  public static List<Integer> findSimpleNumbers(int max) {
    int counter = 0;
    List<Integer> result = new ArrayList<>();
    for (int i = 1; i <= max; i++) {
      boolean simple = true;
      for (int j = 2; j < i; j++) {
        counter++;
        if (i % j == 0) {
          simple = false;
          break;
        }
      }
      if (simple) {
        result.add(i);
      }
    }
    System.out.println("Counter: " + counter);
    return result;
  }

  // Для трёх шестигранных кубиков
  public static double findSum(int sum) {
    int count = 0;
    int successResult = 0;
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        for (int k = 1; k <= 6; k++) {
          if (i + j + k == sum) {
            successResult++;
          }
          count++;
        }
      }
    }
    return ((double) successResult) / ((double) count);
  }

  public static int fib(int position) {
    if (position == 1 || position == 2) {
      return 1;
    }
    return fib(position - 1) + fib(position - 2);
  }

  public static int fib2(int position, AtomicInteger counter) {
    counter.incrementAndGet();
    if (position == 1) {
      return 0;
    }
    if (position == 2) {
      return 1;
    }
    return fib2(position - 1, counter) + fib2(position - 2, counter);
  }
}