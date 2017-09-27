import java.util.*;
public class VectorTest {

  public static void main(String[] args) throws InterruptedException {
      List list = new Vector();
    //List list = new ArrayList();

    for (int i = 0; i < 10; i++) {
      Thread p1 = new Thread(new Producer(list));
      p1.start();
    }

    for (int i = 0; i < 10; i++) {
      Thread c1 = new Thread(new Consumer(list));
      c1.start();
    }
    Thread.yield();

    while (Thread.activeCount() > 1) {
      Thread.sleep(100);
    }

    System.out.println(list.size());

  }

}
