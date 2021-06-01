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
@Table(name="book")
public class Book extends AbstractClass {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_id")
	private Integer bookId;
	@Column(name="title")
	private String title;
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	@Column(name="book_image")
	private String bookImage;
	@Column(name="no_of_copies")
	private Integer noOfCopies;
	@Column(name="book_rent")
	private Integer bookRent;
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public Integer getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public Integer getBookRent() {
		return bookRent;
	}
	public void setBookRent(Integer bookRent) {
		this.bookRent = bookRent;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
