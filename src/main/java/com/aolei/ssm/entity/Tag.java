package com.aolei.ssm.entity;



import java.sql.Date;

public class Tag {
	private int TagId;
	private String tag;
	private int parentTagId;
	private Date createTime;
	private int level;
	
	public int getTagId() {
		return TagId;
	}
	public void setTagId(int tagId) {
		TagId = tagId;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getParentTagId() {
		return parentTagId;
	}
	public void setParentTagId(int parentTagId) {
		this.parentTagId = parentTagId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public Tag(int tagId, String tag, int parentTagId, Date createTime, int level) {
		super();
		TagId = tagId;
		this.tag = tag;
		this.parentTagId = parentTagId;
		this.createTime = createTime;
		this.level = level;
	}
	
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "TagDao [TagId=" + TagId + ", tag=" + tag + ", parentTagId=" + parentTagId + ", createTime=" + createTime
				+ ", level=" + level + "]";
	}
	
	
}
