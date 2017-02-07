package prototype;

import java.util.Date;

public class Client2 {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date date = new Date();
		
		Sheet2 sheet = new Sheet2("…Ÿ¿Ú", date);
		Sheet2 sheet2 = (Sheet2) sheet.clone();
		
		date.setTime(123123L);
		//date = new Date(123123L);
		
		System.out.println(sheet.getName());
		System.out.println(sheet.getBirthday());
		
		
		System.out.println(sheet2.getName());
		System.out.println(sheet2.getBirthday());
		
		
	}

}
