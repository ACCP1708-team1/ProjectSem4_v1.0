package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the servicer database table.
 * 
 */
@Entity
@NamedQuery(name="Servicer.findAll", query="SELECT s FROM Servicer s")
public class Servicer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int description;
	@ManyToOne
	@JoinColumn(name="id_category")
	private Category category;
	private int status;

	private String title;

	public Servicer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDescription() {
		return this.description;
	}

	public void setDescription(int description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}