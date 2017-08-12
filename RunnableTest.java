class ChildThread implements Runnable {
  ChildThread() {
    Thread t = new Thread(this,"Example Thread");
    System.out.println("\t Details of child thread" + t);
    t.start();
  }

  public void run() {
    try {
      for(int i=1; i <= 10; i++) {
        System.out.println("\t for child thread : i =" + i);
        Thread.sleep(500);
      }
    } catch(InterruptedException ie) {
      System.out.println("Child Thread InterruptedException" + ie.getMessage());
    }
    System.out.println("Child Thread Exiting...");
  }
}

public class RunnableTest {
  public static void main(String[] args) {
    new ChildThread();
    try {
      for(int m=1; m <= 10; m++) {
        System.out.println("\t for child thread : m =" + m);
        Thread.sleep(1000);
      }
    } catch(InterruptedException ie) {
      System.out.println("Main Thread Interrupted" + ie.getMessage());
    }
    System.out.println("Main Exiting ... ");
  }
}
