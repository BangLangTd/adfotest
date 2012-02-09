/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;

/**
 * @author Steven
 * 2011-12-20 下午08:29:20
 */
public class DiaryCommentView {
	private Long userId;
	private Long userAttachmentId;
	private Long diaryId;
	private String userName;
	private String commentContent;
	private Date createDate;
	
	public Long getDiaryId(){
		return diaryId;
	}
	public void setDiaryId(Long diaryId){
		this.diaryId=diaryId;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the userAttachmentId
	 */
	public Long getUserAttachmentId() {
		return userAttachmentId;
	}
	/**
	 * @param userAttachmentId the userAttachmentId to set
	 */
	public void setUserAttachmentId(Long userAttachmentId) {
		this.userAttachmentId = userAttachmentId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the commentContent
	 */
	public String getCommentContent() {
		return commentContent;
	}
	/**
	 * @param commentContent the commentContent to set
	 */
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
