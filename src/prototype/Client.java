package prototype;

import java.util.Date;

public class Client {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date date = new Date(1231213123L);
		
		Sheet sheet = new Sheet("…Ÿ¿Ú", date);
		System.out.println(sheet.getName());
		System.out.println(sheet.getBirthday());
		
		date = new Date(1231233L);
		
		Sheet sheet2 = (Sheet) sheet.clone();
		System.out.println(sheet2.getName());
		System.out.println(sheet2.getBirthday());
		
		
	}

}
