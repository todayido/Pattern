package singleton;
import java.util.concurrent.CountDownLatch;


public class Client2 {

	public static void main(String[] args) throws InterruptedException {
		
		long start = System.currentTimeMillis();
		
		final CountDownLatch csl = new CountDownLatch(10); 
		
		for(int i=0; i<10; i++){
				
			new Thread(new Runnable() {
				public void run() {
					for(int i=0; i<100000; i++){
						Object o = SingletonInnerClassDemo.getInstance();
					}
					csl.countDown();
					
				}
			}).start();
		}
		
		csl.await(); // main 线程阻塞，知道计数器为 0，才会继续执行。
		
		long end = System.currentTimeMillis();
		
		System.out.println("总耗时："+ (end-start));
	}
}
