package com.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class AbstractClass {
	@Column(name="created_by")
	private Integer createdBy;
	@Column(name="created_date")
	private Date createdDate;
	@Column(name="updated_by")
	private Integer updatedBy;
	@Column(name="updated_date")
	private Date updatedDate;
	@Column(name="status")
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
