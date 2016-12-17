package designpattern;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	private StaticBlockSingleton () {}
	
	static {
		try {
			System.out.println("StaticBlockSingleton instance create..");
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception creating StaticBlockSingleton instance.");
		}
	}
	
	public static StaticBlockSingleton getInstance () {
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in StaticBlockSingleton instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
	
}