package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;
/**
 * 
 * @author Administrator
 *
 */
public class FavorView{
	private Long userId;
	private Long postId;
	private Date createdDate;
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId= postId;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}