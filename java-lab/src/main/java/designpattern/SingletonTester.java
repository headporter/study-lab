package designpattern;

/**
 * https://blog.seotory.com/post/2016/03/java-singleton-pattern
 * Singleton�Қ����� �� �ּҿ��� �����Խ��ϴ�.
 * JUnit�� �ƴ� �츮�� ģ�� main�Լ��� �׽�Ʈ�ϵ��� �߽��ϴ�.
 */
public class SingletonTester {

	public static void main(String[] args) {
		System.out.println("tester main() start...");
		System.out.println("");
		
		BasicSingleton type1 =  BasicSingleton.getInstance();
		BasicSingleton type2 =  BasicSingleton.getInstance();
		BasicSingleton type3 =  BasicSingleton.getInstance();
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println("");
		
		StaticBlockSingleton type4 =  StaticBlockSingleton.getInstance();
		StaticBlockSingleton type5 =  StaticBlockSingleton.getInstance();
		StaticBlockSingleton type6 =  StaticBlockSingleton.getInstance();
		System.out.println(type4);
		System.out.println(type5);
		System.out.println(type6);
		System.out.println("");
		
		LazySingleton type7 =  LazySingleton.getInstance();
		LazySingleton type8 =  LazySingleton.getInstance();
		LazySingleton type9 =  LazySingleton.getInstance();
		System.out.println(type7);
		System.out.println(type8);
		System.out.println(type9);
		System.out.println("");
		
		// �̰����ʹ� thread�� �׽�Ʈ �ؾ�...
		ThreadSafeSingleton type10 =  ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton type11 =  ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton type12 =  ThreadSafeSingleton.getInstance();
		System.out.println(type10);
		System.out.println(type11);
		System.out.println(type12);
		System.out.println("");
		
		HolderIdiomSingleton type13 =  HolderIdiomSingleton.getInstance();
		HolderIdiomSingleton type14 =  HolderIdiomSingleton.getInstance();
		HolderIdiomSingleton type15 =  HolderIdiomSingleton.getInstance();
		System.out.println(type13);
		System.out.println(type14);
		System.out.println(type15);
		System.out.println("");
	}

}
