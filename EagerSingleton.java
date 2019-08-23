/* Example of Creational Singleton Design Pattern Eager Instantiation.
	1.	A private static variable, holding the only instance of the class.
	2.	A private constructor, so it cannot be instantiated anywhere else.
	3.	A public static method, to return the single instance of the class.

This poses a hefty drawback if this class is not being used at all by the client application. The contingency plan is the lazy Instantiation.
*/
public class EagerSingleton{
	// create an instance of the class.
	private static EagerSingleton instance = new EagerSingleton();

	//private constructor, so it cannot be instiated outside this class.
	private EagerSingleton() {}

	// get the only instance of the object created.
	public static EagerSingleton getInstance(){
		return instance;
	}
}