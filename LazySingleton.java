/* Example of Creational Singleton Design Pattern Lazy Instantiation.
	1.	A private static variable, holding the only instance of the class.
	2.	A private constructor, so it cannot be instantiated anywhere else.
	3.	A public static method, to return the single instance of the class.
 Lazy instantiation Steps:-
 1.	Static variable is initially decleared null.
 2.	Instance of the class is only instantiated within getInstance() method if and only if the instance variable remains null at the time of check.

This poses a hefty drawback What if two different clients access the Singleton class at the same time, right to the millisecond? Well, they will check if the instance is null at the same time, and will find it true, and so will create two instances of the class for each request by the two clients. The contingency plan is the Thread Safe Instantiation.
*/
public class LazySingleton{
	// Initialize the instance as null.
	private static LazySingleton instance = null;

	// Private Constructor, so it cannot be instantiated outside this class.
	private LazySingleton() {}

	// Check if the instance is null, and if so, create the object.
	public static LazySingleton getInstance() {
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}