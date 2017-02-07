package builder;

public class Client {

	public static void main(String[] args) {
		
		AirshipDirector ad = new MyAirshipDirector(new MyAirshipBuilder());
		Airship airship = ad.diretorAirship();
		
		System.out.println(airship.getEngine());
	}
}
