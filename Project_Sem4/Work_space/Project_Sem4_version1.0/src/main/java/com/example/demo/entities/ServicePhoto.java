package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the service_photo database table.
 * 
 */
@Entity
@Table(name="service_photo")
@NamedQuery(name="ServicePhoto.findAll", query="SELECT s FROM ServicePhoto s")
public class ServicePhoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String photo;

	private int status;

	private String title;

	//bi-directional many-to-one association to Servicer
	@ManyToOne
	@JoinColumn(name="id_serivce")
	private Servicer servicer;

	public ServicePhoto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public Servicer getServicer() {
		return this.servicer;
	}

	public void setServicer(Servicer servicer) {
		this.servicer = servicer;
	}

}