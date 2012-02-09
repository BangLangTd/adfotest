/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

import java.util.List;

/**
 * @author Steven
 * 2011-12-25 上午10:19:37
 */
public class TimelineJsonView {
	private String id;
	private String title;
	private String description;
	private String focus_date;
	private Integer initial_zoom;
	private String timezone;
	private List<TimelineJsonEventsView> events;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the focus_data
	 */
	public String getFocus_date() {
		return focus_date;
	}
	/**
	 * @param focus_data the focus_data to set
	 */
	public void setFocus_date(String focus_date) {
		this.focus_date = focus_date;
	}
	/**
	 * @return the initial_zoom
	 */
	public Integer getInitial_zoom() {
		return initial_zoom;
	}
	/**
	 * @param initial_zoom the initial_zoom to set
	 */
	public void setInitial_zoom(Integer initial_zoom) {
		this.initial_zoom = initial_zoom;
	}
	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the events
	 */
	public List<TimelineJsonEventsView> getEvents() {
		return events;
	}
	/**
	 * @param events the events to set
	 */
	public void setEvents(List<TimelineJsonEventsView> events) {
		this.events = events;
	}
	
	

}
