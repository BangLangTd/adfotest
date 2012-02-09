/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

/**
 * @author THON
 * @mail thon.ju@meet-future.com
 * @date 2011-12-25 下午10:41:36
 * @description
 */
public class PrivateLetterView {
	private Long id;
	private String nickname;
	private String emails;
	private String sendcontent;
	private String fromUsername;
	private Long fromUsernameAttachmentId;
	private String toUsername;
	private Long toUsernameAttachmentId;
	private Long userid;
	private boolean jugment;

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setJugment(boolean jugment) {
		this.jugment = jugment;
	}
	public boolean getJugment(){
		return jugment;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getUserid() {
		return userid;
	}
	public String getEmails() {
		return emails;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}
	public String getSendcontent() {
		return sendcontent;
	}
	public void setSendcontent(String sendcontent) {
		this.sendcontent = sendcontent;
	}
	public String getFromUsername(){
		return fromUsername;
	}
	public void setFromUsername(String fromUsername){
		this.fromUsername=fromUsername;
	}
	public String getToUsername(){
		return toUsername;
	}
	public void setToUsername(String toUsername){
		this.toUsername=toUsername;
	}
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public Long getFromUsernameAttachmentId(){
		return fromUsernameAttachmentId;
	}
	public void setFromUsernameAttachmentId(Long fromUsernameAttachmentId){
		this.fromUsernameAttachmentId=fromUsernameAttachmentId;
	}
	public Long getToUsernameAttachmentId(){
		return toUsernameAttachmentId;
	}
	public void setToUsernameAttachmentId(Long toUsernameAttachmentId){
		this.toUsernameAttachmentId=toUsernameAttachmentId;
	}
	
}
