package designpattern;

public class HolderIdiomSingleton {
	private HolderIdiomSingleton () {}
	private static class Singleton {
		private static final HolderIdiomSingleton instance = new HolderIdiomSingleton();
	}
	
	public static HolderIdiomSingleton getInstance () {
		return Singleton.instance;
	}
}
