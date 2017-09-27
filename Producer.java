import java.util.*;
class Producer implements Runnable {

  private List list;

  public Producer(List pList) {
    list = pList;
  }

  public void run() {
    System.out.println("Producer started");
    for (int i = 0; i < 5000; i++) {
      list.add(Integer.toString(i));
    }
    System.out.println("Producer completed");
  }

}
