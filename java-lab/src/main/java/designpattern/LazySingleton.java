package designpattern;

public class LazySingleton {
	private static LazySingleton instance;
	private LazySingleton () {}
	
	public static LazySingleton getInstance () {
		if ( instance == null ) {
			System.out.println("LazySingleton instance create..");
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in LazySingleton instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
}
