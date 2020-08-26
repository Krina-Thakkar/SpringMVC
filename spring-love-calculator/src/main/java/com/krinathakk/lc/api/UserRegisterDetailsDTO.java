package com.krinathakk.lc.api;

public class UserRegisterDetailsDTO {
	
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobby;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "UserRegisterDetailsDTO [name=" + name + ", userName=" + userName + ", password=" + password
				+ ", country=" + country + ", hobby=" + hobby + ", gender=" + gender + "]";
	}
}
