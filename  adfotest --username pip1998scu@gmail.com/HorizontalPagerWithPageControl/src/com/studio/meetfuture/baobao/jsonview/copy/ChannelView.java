/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;
import java.util.List;


public class ChannelView {
	Long id;
	String name;
	Date createdDate;
	
	List<PostView> postViews;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<PostView> getPostViews() {
		return postViews;
	}

	public void setPostViews(List<PostView> postViews) {
		this.postViews = postViews;
	}
	

}
