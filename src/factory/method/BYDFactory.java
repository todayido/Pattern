package factory.method;

public class BYDFactory implements CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BYD();
	}

}
