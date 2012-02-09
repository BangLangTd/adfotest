package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;


public class PostCommentView{
	private  Long id;
	private Long postId;
	private Long attachmentId;
	private String nickname;
	private String comment;
	private Date createdDate;
	private Long createdBy;

	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id=id;
	}
	
	public Long getPostId(){
		return postId;
	}
	public void setPostId(Long postId){
		this.postId=postId;
	}
	public String getComment(){
		return comment;
	}
	public void setComment(String comment){
		this.comment=comment;
	}
	public Date getCreatedDate(){
		return createdDate;
	}
	public void setCreatedDate(Date createdDate){
		this.createdDate=createdDate;
	}
	public Long getCreatedBy(){
		return createdBy;
	}
	public void setCreatedBy(Long createdBy){
		this.createdBy=createdBy;	
	}
	public Long getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}