package singleton;

public class SingletonLazyDemo {

	// ��ʱ���أ�����ʼ���������õ�ʱ���ڼ���
	private static SingletonLazyDemo s;
	
	//˽�й���������ֹ�ⲿ����
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
