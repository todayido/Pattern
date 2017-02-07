package singleton;

public class SingletonInnerClassDemo {

	private static class SingletonInnerInstance{
		private static /*final*/ SingletonInnerClassDemo instance = new SingletonInnerClassDemo();
	};
	
	private SingletonInnerClassDemo(){};
	
	public static SingletonInnerClassDemo getInstance(){
		return SingletonInnerInstance.instance;
	}
	
	public static void main(String[] args) {
		SingletonInnerClassDemo sd = SingletonInnerClassDemo.getInstance();
		SingletonInnerClassDemo sd2 = SingletonInnerClassDemo.getInstance();
		System.out.println(sd==sd2);// true
	}
	
}
