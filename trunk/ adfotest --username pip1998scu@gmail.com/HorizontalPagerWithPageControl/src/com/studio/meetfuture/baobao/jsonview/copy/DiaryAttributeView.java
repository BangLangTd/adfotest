/**
 * 
 */
package com.studio.meetfuture.baobao.jsonview.copy;

/**
 * @author THON
 * @mail thon.ju@meet-future.com
 * @date 2012-1-16 上午11:06:28
 * @description
 */
public class DiaryAttributeView {
	private Long id;
	private Long attributeId;
	private String attributeCode;
	private String attributeName;
	private String attributeContent;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAttributeContent() {
		return attributeContent;
	}
	public void setAttributeContent(String attributeContent) {
		this.attributeContent = attributeContent;
	}
	public Long getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}
	public String getAttributeCode() {
		return attributeCode;
	}
	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
}
