package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;


public class ChildrenView{
	private Long id;
	private String nickname;
	private String realName;
	private Date birthdate;
	private Integer gestationalAge;
	
	// helper
	private Long userId;
	// refer
	
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getNickname(){
		return nickname;
	}
	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	public String getRealName(){
		return realName;
	}
	public void setRealName(String realName){
		this.realName=realName;
	}
	public Date getBirthdate(){
		return birthdate;
	}
	public void setBirthdate(Date birthdate){
		this.birthdate=birthdate;
	}
	public Integer getGestationalAge(){
		return gestationalAge;
	}
	public void setGestationalAge(Integer gestationalAge){
		this.gestationalAge=gestationalAge;
	}
	public Long getUserId(){
		return userId;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}
	
}