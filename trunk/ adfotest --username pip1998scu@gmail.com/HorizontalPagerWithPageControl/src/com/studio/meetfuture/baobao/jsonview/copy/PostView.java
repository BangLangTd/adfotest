/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;
import java.util.List;

/**
 * @author THON
 * @mail thon.ju@meet-future.com
 * @date 2011-12-31 上午08:17:15
 * @description
 */
public class PostView {
	Long id;
	Long postAttachmentId;
	Long channelId;
	String title;
	String content;
	Date createdDate;
	String author;
	
	List<TagView> tagViews;
	List<PostCommentView> postCommentViews;

	public Long getPostAttachmentId() {
		return postAttachmentId;
	}

	public void setPostAttachmentId(Long postAttachmentId) {
		this.postAttachmentId = postAttachmentId;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getChannelId(){
		return channelId;
	}
	public void setChannelId(Long channelId){
		this.channelId=channelId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<TagView> getTagViews() {
		return tagViews;
	}

	public void setTagViews(List<TagView> tagViews) {
		this.tagViews = tagViews;
	}
	public List<PostCommentView> getPostCommentViews(){
		return postCommentViews;
	}
	public void setPostCommentViews(List<PostCommentView> postCommentViews){
		this.postCommentViews=postCommentViews;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
