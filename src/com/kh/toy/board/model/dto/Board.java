package com.kh.toy.board.model.dto;

import java.sql.Date;

public class Board {

	private String bdIdx;
	private String userId;
	private Date regDate;
	private String title;
	private String content;
	private int isDel;
	
	/**
	 * @return the bdIdx
	 */
	public String getBdIdx() {
		return bdIdx;
	}
	/**
	 * @param bdIdx the bdIdx to set
	 */
	public void setBdIdx(String bdIdx) {
		this.bdIdx = bdIdx;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the regDate
	 */
	public Date getRegDate() {
		return regDate;
	}
	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the isDel
	 */
	public int getIsDel() {
		return isDel;
	}
	/**
	 * @param isDel the isDel to set
	 */
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	@Override
	public String toString() {
		return "Board [bdIdx=" + bdIdx + ", userId=" + userId + ", regDate=" + regDate + ", title=" + title
				+ ", content=" + content + ", isDel=" + isDel + "]";
	}
	
	
	
	
	
	
}
