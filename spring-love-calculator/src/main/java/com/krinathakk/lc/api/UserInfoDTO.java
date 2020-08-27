package com.krinathakk.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message=" * yourname can't be blank")
	// @Min(value=3,message="* yourname should have atleast three char")
	@Size(min=3,max=15,message="* yourname should have atleast three char and max 15 char")
	private String userName;
	private String crushName;
	
	@AssertTrue(message="You have to agree to use this app")
	private boolean termAndCondition;
	
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
