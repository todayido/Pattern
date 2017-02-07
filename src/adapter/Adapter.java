package adapter;

/**
 * 
 * 相当于 ( user / ps2 ) 转换器
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void handlerReq() {
		super.handleReq();
	}

}
