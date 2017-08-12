class CallMe {

	synchronized void call(String msg) {
		System.out.println("**"+msg);
		try{
			Thread.sleep(1000);
		} 
		catch(InterruptedException e){
			System.out.println(" Imterrupted ");
		}
		System.out.println("*-");
	}

}

class Caller implements Runnable {
	String msg;
	CallMe target ;
	Thread t;
	public Caller(CallMe targ, String str) {
		target = targ;	msg = str;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		target.call(msg);
	}
}

class SynchTest {
	public static void main(String  args[]) {
		CallMe target = new CallMe();
		Caller obj1 = new Caller(target," Java ");
		Caller obj2 = new Caller(target," is ");
		Caller obj3 = new Caller(target," Object ");
		Caller obj4 = new Caller(target," Oriented ");
		// Waiting for the Thread to End
		try{
			obj1.t.join();obj2.t.join();obj3.t.join();obj4.t.join();
		}
		catch(InterruptedException e) {
			System.out.println(" Main Thread is Imterrupted ");
		}
	}
}