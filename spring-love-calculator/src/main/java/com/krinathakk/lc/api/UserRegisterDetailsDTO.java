package com.krinathakk.lc.api;
import com.krinathakk.lc.Validator.Age;
public class UserRegisterDetailsDTO {
	
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobby;
	private String gender;
	
	//@Age(lower=30,upper=75,message="should be between 30 and 75")
	@Age
	private Integer Age;

	private communicationDTO communicationDto;
	
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
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	} 
	public communicationDTO getCommunicationDto() {
		return communicationDto;
	}
	public void setCommunicationDto(communicationDTO communicationDto) {
		this.communicationDto = communicationDto;
	}
	
	@Override
	public String toString() {
		return "UserRegisterDetailsDTO [name=" + name + ", userName=" + userName + ", password=" + password
				+ ", country=" + country + ", hobby=" + hobby + ", gender=" + gender + "]";
	}
}
