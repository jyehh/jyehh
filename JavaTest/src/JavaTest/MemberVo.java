package JavaTest;

import java.time.LocalDateTime;

public class MemberVo {

	private String name;
	
	private LocalDateTime birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "MemberVo [name=" + name + ", birthday=" + birthday + "]";
	}
	

}
