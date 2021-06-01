package com.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="rent")
public class Rent extends AbstractClass{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rent_id")
	private Integer rentId;
	@Column(name="rent_date")
	private Date rentDate;
	@Column(name="due_date")
	private Date dueDate;
	@Column(name="total_rent")
	private Integer totalRent;
	@Column(name="remarks")
	private String remarks;
	public Integer getRentId() {
		return rentId;
	}
	public void setRentId(Integer rentId) {
		this.rentId = rentId;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Integer getTotalRent() {
		return totalRent;
	}
	public void setTotalRent(Integer totalRent) {
		this.totalRent = totalRent;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
