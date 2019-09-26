package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the faq database table.
 * 
 */
@Entity
@NamedQuery(name="Faq.findAll", query="SELECT f FROM Faq f")
public class Faq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String anwers;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Lob
	private String question;

	private byte status;

	public Faq() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnwers() {
		return this.anwers;
	}

	public void setAnwers(String anwers) {
		this.anwers = anwers;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}