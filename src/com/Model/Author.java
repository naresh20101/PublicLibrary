package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name="author")
@Where(clause="status=1")
public class Author extends AbstractClass{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="author_id")
	private Integer authorId;
	@Column(name="author_name")
	private String authorName;
	@Column(name="no_of_publications")
	private Integer noOfPublications;
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getNoOfPublications() {
		return noOfPublications;
	}
	public void setNoOfPublications(Integer noOfPublications) {
		this.noOfPublications = noOfPublications;
	}

}
