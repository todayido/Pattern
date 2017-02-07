package singleton;

public class SingletonDemo {

	// 初始化时立即加载，加载类的时候直接初始化，天然的线程安全
	private static /*fina*/ SingletonDemo instance = new SingletonDemo();
	
	//私有构造器，禁止外部访问
	private SingletonDemo(){};
	
	// 方法没有同步，调用效率高
	public static SingletonDemo getInstance(){
		return instance;
	}
	
}
