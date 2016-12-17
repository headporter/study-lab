package designpattern;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton () {}
	
	public static synchronized ThreadSafeSingleton getInstance () {
		if (instance == null) {
			System.out.println("ThreadSafeSingleton instance create..");
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in ThreadSafeSingleton instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
}
