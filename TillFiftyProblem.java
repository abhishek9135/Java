class PrintRange extends Thread {
  int start,end;
  PrintRange(int start,int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public void run() {
    for(int i=start; i<=end; i++)
    System.out.println(Thread.currentThread().getName() + " : " + i);
  }
}

public class TillFiftyProblem {
  public static void main(String[] args) {
    Thread t1 = new PrintRange(1,5);
    Thread t2 = new PrintRange(6,10);
    Thread t3 = new PrintRange(11,15);
    Thread t4 = new PrintRange(16,20);
    Thread t5 = new PrintRange(21,25);
    Thread t6 = new PrintRange(26,30);
    Thread t7 = new PrintRange(31,35);
    Thread t8 = new PrintRange(36,40);
    Thread t9 = new PrintRange(41,45);
    Thread t10 = new PrintRange(46,50);
    try {
      t1.start();
      t1.join();
      t2.start();
      t2.join();
      t3.start();
      t3.join();
      t4.start();
      t4.join();
      t5.start();
      t5.join();
      t6.start();
      t6.join();
      t7.start();
      t7.join();
      t8.start();
      t8.join();
      t9.start();
      t9.join();
      t10.start();
      t10.join();
    } catch (InterruptedException ie) {ß}
    // Don't know what teacher want but a newSignleThreadExecutor will be more suitable here.
  }
}
