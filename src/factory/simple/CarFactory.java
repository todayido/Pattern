package factory.simple;

public class CarFactory {
	
	public static Car createCar(String type){
		if("�µ�".equals(type)){
			return new Audi();
		}else if("���ǵ�".equals(type)){
			return new BYD();
		}else{
			return null;
		}
	}
}
