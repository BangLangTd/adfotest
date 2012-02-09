package com.studio.meetfuture.baobao.jsonview.copy;


import java.util.Date;
import java.util.List;

public class DiaryView{
	
	private Long id;
	private Long categoryId;
	private String nickname;
	private Date diaryDate;
	private Date diaryDateShort;
	private Integer favorCount;
	private Integer commentCount;
	private Double longitude;
	private Double latitude;
	private String local;

	private Long createdBy;
	private Date createdDate;
	
	List<DiaryCommentView> diaryCommentViews;
	List<DiaryAttributeView> diaryAttributeViews;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDiaryDate() {
		return diaryDate;
	}
	public void setDiaryDate(Date diaryDate) {
		this.diaryDate = diaryDate;
	}
	public Date getDiaryDateShort() {
		return diaryDateShort;
	}
	public void setDiaryDateShort(Date diaryDateShort) {
		this.diaryDateShort = diaryDateShort;
	}
	public Integer getFavorCount() {
		return favorCount;
	}
	public void setFavorCount(Integer favorCount) {
		this.favorCount = favorCount;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public List<DiaryCommentView> getDiaryCommentViews() {
		return diaryCommentViews;
	}
	public void setDiaryCommentViews(List<DiaryCommentView> diaryCommentViews) {
		this.diaryCommentViews = diaryCommentViews;
	}
	public List<DiaryAttributeView> getDiaryAttributeViews() {
		return diaryAttributeViews;
	}
	public void setDiaryAttributeViews(List<DiaryAttributeView> diaryAttributeViews) {
		this.diaryAttributeViews = diaryAttributeViews;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getNickname() {
		return nickname;
	}
}
