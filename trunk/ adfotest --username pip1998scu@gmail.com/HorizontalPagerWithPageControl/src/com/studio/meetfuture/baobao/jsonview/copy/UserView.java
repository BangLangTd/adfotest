/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.Date;
import java.util.List;

/**
 * @author THON
 * @email thon.ju@meet-future.com
 * @date 2011-11-29 下午03:31:35
 * @description:
 */
public class UserView {
	
	private Long id;
	private String email;
	private String username;
	private String nickname;
	private String timezone;
	private String local;
	private Double latitude;
	private Date lastLoginDate;
	private String description;
	private Long attachmentId;
	private Integer gender;
	
	List<TimelineView> timelineViews;
	List<ChildrenView> childrenViews;
	
	public double getLatitude(){
		return latitude;
	}
	public void setLatitude(double latitude){
		this.latitude=latitude;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getGender(){
		return gender;
	}
	public void setGender(Integer gender){
		this.gender=gender;
	}
	public List<TimelineView> getTimelineViews() {
		return timelineViews;
	}
	public void setTimelineViews(List<TimelineView> timelineViews) {
		this.timelineViews = timelineViews;
	}

	public List<ChildrenView> getChildrenViews(){
		return childrenViews;
	}
	public void setChildrenViews(List<ChildrenView> childrenViews){
		this.childrenViews=childrenViews;
	}
}
