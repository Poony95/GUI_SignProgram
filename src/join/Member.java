package join;

import java.io.Serializable;

public class Member implements Serializable{ // 어레이리스트는 파일 내보낼 때 직렬화시킨다.
										 // 벡터 사용할 때는 직렬화 자동으로 되있어서 안함	
	private String name;
	private String phone;
	private String gender;
	private String addr;
	private boolean agree;
	public Member(String name, String phone, String gender, String addr, boolean agree) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.addr = addr;
		this.agree = agree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + ", gender=" + gender + ", addr=" + addr + ", agree="
				+ agree + "]";
	}
	
}
