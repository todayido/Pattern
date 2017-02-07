package prototype;

/**
 * 
 * 测试 new 方式创建对象和 clone 创建对象的差异
 * 如果 new 的方式比较耗时，则采用原型模式创建对象
 * @author Administrator
 *
 */
public class ClientTest {
	
	public static void newCreate(int size) throws InterruptedException{
		long start = System.currentTimeMillis();
		for(int i=0;i<size;i++){
			Laptop l = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("NEW 的方法耗时:"+(end-start));
	}
	
	public static void cloneCreate(int size) throws InterruptedException, CloneNotSupportedException{
		long start = System.currentTimeMillis();
		Laptop l = new Laptop();
		for(int i=0;i<size;i++){
			Laptop lt = (Laptop) l.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("CLONE 的方法耗时:"+(end-start));
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		ClientTest.newCreate(1000);
		ClientTest.cloneCreate(1000);
	}
	
}

class Laptop implements Cloneable{
	public Laptop() throws InterruptedException{
		Thread.sleep(1);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}