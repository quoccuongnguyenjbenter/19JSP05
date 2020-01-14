package vn.cuong.models;

public class UserInfo {
	public String name,country;
	public int age;
	public UserInfo(String name, String country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
