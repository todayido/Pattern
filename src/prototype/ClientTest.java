package prototype;

/**
 * 
 * ���� new ��ʽ��������� clone ��������Ĳ���
 * ��� new �ķ�ʽ�ȽϺ�ʱ�������ԭ��ģʽ��������
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
		System.out.println("NEW �ķ�����ʱ:"+(end-start));
	}
	
	public static void cloneCreate(int size) throws InterruptedException, CloneNotSupportedException{
		long start = System.currentTimeMillis();
		Laptop l = new Laptop();
		for(int i=0;i<size;i++){
			Laptop lt = (Laptop) l.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("CLONE �ķ�����ʱ:"+(end-start));
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