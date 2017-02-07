package singleton;

public class SingletonLazyDemo {

	// 延时加载，不初始化，真正用的时候在加载
	private static SingletonLazyDemo s;
	
	//私有构造器，禁止外部访问
	private SingletonLazyDemo(){};
	
	public static synchronized SingletonLazyDemo getInstance(){
		if(s == null){
			s = new SingletonLazyDemo();
		}
		return s;
	}
	
	public static void main(String[] args) {
		SingletonLazyDemo sd = SingletonLazyDemo.getInstance();
		SingletonLazyDemo sd2 = SingletonLazyDemo.getInstance();
		System.out.println(sd==sd2);// true
	}
	
}
