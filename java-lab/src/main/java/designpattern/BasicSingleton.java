package designpattern;

public class BasicSingleton {
	// private static �� ����.
	private static BasicSingleton instance = new BasicSingleton();
	// ������
	private BasicSingleton () {
		System.out.println( "call BasicSingleton constructor." );
	}
	// ��ȸ method
	public static BasicSingleton getInstance () {
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in BasicSingleton instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
}
