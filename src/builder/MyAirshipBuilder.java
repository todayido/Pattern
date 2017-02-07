package builder;

public class MyAirshipBuilder implements AirshipBuilder{

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("BuildOrbitalModule");
		return new OrbitalModule("my buildOrbitalModule..."); // �˴����Ժ� ����ģʽ ����ģʽ ����
	}

	@Override
	public Engine buildEngine() {
		System.out.println("Engine");
		return new Engine("my Engine...");
	}

	@Override
	public EscapeTower buildEscapeTower() {
		System.out.println("EscapeTower");
		return new EscapeTower("my EscapeTower...");
	}

	
}
