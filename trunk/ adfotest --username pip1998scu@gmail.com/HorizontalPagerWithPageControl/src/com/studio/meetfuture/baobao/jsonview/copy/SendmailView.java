package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;

public class SendmailView{
	
	private Long senderId;
	private Long receviewId;
	private String email;
	private String inviteText;
	private Date creatDate;
	
	public SendmailView(){}
	
	
	public Long getSenderId(){
		return senderId;
	}
	public void setSenderId(Long senderId){
		this.senderId=senderId;
	}
	
	public Long getReceviewId(){
		return receviewId;
	}
	public void setReceviewId(Long receviewId){
		this.receviewId=receviewId;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getInvitetext(){
		return inviteText;
	}
	public void setInvitetext(String invitetext){
		this.inviteText=invitetext;
	}
}