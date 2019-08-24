/* Example of Creational Singleton Design Pattern Thread Safe Instantiation.
	1.	A private static variable, holding the only instance of the class.
	2.	A private constructor, so it cannot be instantiated anywhere else.
	3.	A public static method, to return the single instance of the class with a Synchronized block.

The OverHead for the Synchronized method is hign, and reduces the performance of the whole operation. To reduce this overhead double locking is used. the check is used before the synchronized method as well, and if ht value is not null alone, does the synchronized method run.
*/
public class ThreadSafeSingleton{
	// Initialize the instance as null.
	private static ThreadSafeSingleton instance = null;

	// Private Constructor, so it cannot be instantiated outside this class.
	private ThreadSafeSingleton() {}

	// Check if the instance is null, and if so, create the object.
	public static ThreadSafeSingleton getInstance() {
		synchronized (ThreadSafeSingleton){
			if(instance == null){
				instance = new ThreadSafeSingleton();
			}
		}
		return instance;
	}
}