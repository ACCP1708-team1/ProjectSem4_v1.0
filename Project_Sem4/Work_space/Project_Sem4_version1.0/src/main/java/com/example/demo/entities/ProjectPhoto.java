package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the project_photo database table.
 * 
 */
@Entity
@Table(name="project_photo")
@NamedQuery(name="ProjectPhoto.findAll", query="SELECT p FROM ProjectPhoto p")
public class ProjectPhoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String photo;

	private byte status;

	private String title;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="id_project")
	private Project project;

	public ProjectPhoto() {
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

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}