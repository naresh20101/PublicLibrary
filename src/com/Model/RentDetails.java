package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rent_details")
public class RentDetails extends AbstractClass{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rent_details_id")
	private Integer rentDetailsId;
	@ManyToOne
	@JoinColumn(name="rent_id")
	private Rent rent;
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	public Integer getRentDetailsId() {
		return rentDetailsId;
	}
	public void setRentDetailsId(Integer rentDetailsId) {
		this.rentDetailsId = rentDetailsId;
	}
	public Rent getRent() {
		return rent;
	}
	public void setRent(Rent rent) {
		this.rent = rent;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
