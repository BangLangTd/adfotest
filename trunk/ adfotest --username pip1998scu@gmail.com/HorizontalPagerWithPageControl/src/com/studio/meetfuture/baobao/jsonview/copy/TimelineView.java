/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;
import java.util.List;

//import com.meetstudio.growth.service.timeline.model.DiaryPage;

/**
 * @author THON
 * @mail thon.ju@meet-future.com
 * @date 2011-12-23 上午10:59:23
 * @description
 */
public class TimelineView {
	private Long id;
	private String name;
	private String realname;
	private Date birthdate;
	private int gestationalAge;
	private String description;
	private Integer commentLevel;
	private Date createdDate;
	private Date modifiedDate;
	private Long modifiedBy;
	private Long attachmentId;
	
	
	List<DiaryView> diaryViews;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCommentLevel() {
		return commentLevel;
	}
	public void setCommentLevel(Integer commentLevel) {
		this.commentLevel = commentLevel;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Long getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}
	public List<DiaryView> getDiaryViews() {
		return diaryViews;
	}
	public void setDiaryViews(List<DiaryView> diaryViews) {
		this.diaryViews = diaryViews;
	}
	public String getRealname(){
		return realname;
	}
	public void setRealname(String realname){
		this.realname=realname;
	}
	public Date getBirthdate(){
		return birthdate;
	}
	public void setBirthdate(Date birthdate){
		this.birthdate=birthdate;
	}
	public int getGestationalAge(){
		return gestationalAge;
	}
	public void setGestationalAge(int gestationalAge){
		this.gestationalAge=gestationalAge;
	}
	
}
