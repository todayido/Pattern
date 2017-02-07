package prototype;

import java.util.Date;

/**
 * Ç³¶È¸´ÖÆ
 * @author Administrator
 *
 */
public class Sheet implements Cloneable{
	
	private String name;
	private Date birthday;
	
	public Sheet() {
	}
	

	public Sheet(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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
