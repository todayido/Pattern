package prototype;

import java.util.Date;

/**
 * …Ó∂»∏¥÷∆
 * @author Administrator
 *
 */
public class Sheet2 implements Cloneable{
	
	private String name;
	private Date birthday;
	
	public Sheet2() {
	}

	public Sheet2(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj =  super.clone();
		
		Sheet2 s = (Sheet2) obj;
		s.birthday = (Date) this.birthday.clone();
		
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
}
