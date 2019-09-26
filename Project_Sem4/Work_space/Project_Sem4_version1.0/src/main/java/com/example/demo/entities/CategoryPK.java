package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the category database table.
 * 
 */
@Embeddable
public class CategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	private String title;

	private byte status;

	public CategoryPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public byte getStatus() {
		return this.status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CategoryPK)) {
			return false;
		}
		CategoryPK castOther = (CategoryPK)other;
		return 
			(this.id == castOther.id)
			&& this.title.equals(castOther.title)
			&& (this.status == castOther.status);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.title.hashCode();
		hash = hash * prime + ((int) this.status);
		
		return hash;
	}
}